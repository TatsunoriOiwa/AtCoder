package oiwa.atcoder.util;

import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {
	
	public Tester(Class<?> clazz, Case[] cases) {
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
		if (!c.isEnabled()) { return; }
		System.out.println("Test case # " + i);
		try {
			StringOutputStream peeker = new StringOutputStream();
			Object sbj = clazz.getConstructor().newInstance();
			Method method = clazz.getMethod("run", PrintWriter.class);
			
			System.setIn(new ByteArrayInputStream(c.getTest().getBytes()));
			long timemillis = System.currentTimeMillis();
			
			PrintWriter out = new PrintWriter(peeker); // TODO: wrap with System out peeker.
			method.invoke(sbj, out);
			out.flush();
			
			timemillis = System.currentTimeMillis() - timemillis;
			System.out.print(" took " + timemillis + " msec.");
			
			String result = peeker.convert();
			if (!result.endsWith("\r\n")) result += "\r\n";
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
