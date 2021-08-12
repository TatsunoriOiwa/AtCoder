package oiwa.atcoder.util;

import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesterV10 {
	
	public TesterV10(Class<?> clazz, Case[] cases) {
		this.run(clazz, cases);
	}
	
	private void run(Class<?> clazz, Case[] cases) {
		for (int i = 0; i < cases.length; i++) {
			Case c = cases[i];
			try {
				test(c, i, clazz);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void test(Case c, int i, Class<?> clazz) {
		if (!c.isEnabled()) { 
			System.out.println("Test case # " + i + " skipped.");
			return;
		}
		System.out.println("Test case # " + i);
		try {
			StringOutputStream peeker = new StringOutputStream();
			Object sbj = clazz.getConstructor().newInstance();
			Method method = clazz.getMethod("run", PrintWriter.class);
			Field field = clazz.getField("DEBUG");
			field.setBoolean(sbj, true);
			
			System.setIn(new ByteArrayInputStream(c.getTest().getBytes()));
			long timemillis = System.currentTimeMillis();
			
			PrintWriter out = new PrintWriter(peeker);
			method.invoke(sbj, out);
			out.flush();
			
			timemillis = System.currentTimeMillis() - timemillis;
			System.out.print(" took " + timemillis + " msec.");
			
			String result = peeker.convert().stripTrailing();
			
			CaseResult res = c.predicate(result);
			switch (res) {
			case SUCCESS: System.out.println(" Success!"); break;
			case SKIP: System.out.println(" skip"); break;
			case FAIL:
				System.out.println(" Failed!");
				System.out.print("result  :");
				if (result.contains("\n")) System.out.println();
				System.out.println(result);
				System.out.println("correct :");
				String ansstr = c.getAns();
				if (ansstr.contains("\n")) System.out.println();
				System.out.println(ansstr);
				break;
			default:
				System.err.println("WARN : THIS IS NOT SUPPOSED TO HAPPEN!!! something went wrong at TesterV10#test.");
				break;
			}
			
			if (c.getAns() == null) {
				System.out.println("Pass");
			} else {
				if (result.equals(c.getAns())) {
					System.out.println(" Success!");
				} else {
					System.out.println(" Failed!");
					System.out.println("result  :" + result);
					System.out.println("correct :" + c.getAns());
				}
			}
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | NoSuchFieldException e) {
			System.err.println("Caught an exception while performing tests!");
			e.printStackTrace();
			return;
		}

	}
}
