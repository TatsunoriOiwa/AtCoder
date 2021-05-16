package oiwa.atcoder.util;

import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

@Deprecated
public class TesterOld {
	
	@Deprecated
	public TesterOld(Consumer<String[]> clazz, Case[] cases) {
//		this.run(clazz, cases);
	}
	
	@SuppressWarnings("unused")
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
		if (!c.isEnabled()) { return; }
		System.out.println("Test case # " + i);
		try {
			StringOutputStream peeker = new StringOutputStream();
			Object sbj = clazz.getConstructor().newInstance();
			Method method = clazz.getMethod("run", PrintWriter.class);
			
			long timemillis = System.currentTimeMillis();
			
			PrintWriter out = new PrintWriter(peeker); // TODO: wrap with System out peeker.
			method.invoke(sbj, out);
			out.flush();
			
			timemillis = System.currentTimeMillis() - timemillis;
			System.out.print(" took " + timemillis + " msec.");
			
			String result = peeker.convert();
			if (result.equals(c.getAns())) {
				System.out.println(" Success!");
			} else {
				System.out.println(" Failed!");
				System.out.println("result  :" + result);
				System.out.println("correct :" + c.getAns());
			}
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			System.err.println("Caught an exception while performing tests!");
			e.printStackTrace();
			return;
		}

	}
}
