package oiwa.atcoder.util;

import java.io.ByteArrayInputStream;
import java.util.function.Consumer;

public class Tester {
	private PrintStreamPeeker peeker;
	
	public Tester(Consumer<String[]> subject, Case[] cases) {
		this.run(subject, cases);
	}
	
	private void run(Consumer<String[]> subject, Case[] cases) {
		System.setOut(AtLogger.peeker = peeker = new PrintStreamPeeker(System.out));
		for (int i = 0; i < cases.length; i++) {
			Case c = cases[i];
			try {
				test(c, i, subject);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void test(Case c, int i, Consumer<String[]> subject) {
		if (!c.isEnabled()) { return; }
		System.out.print("Test case # " + i);
		this.peeker.peek();
		System.setIn(new ByteArrayInputStream(c.getTest().getBytes()));
		long timemillis = System.currentTimeMillis();
		subject.accept(null);
		timemillis = System.currentTimeMillis() - timemillis;
		String result = this.peeker.convert();
		System.out.print(" took " + timemillis + " msec.");
		if (result.equals(c.getAns())) {
			System.out.println(" Success!");
		} else {
			System.out.println(" Failed!");
			System.out.println("correct :" + c.getAns());
			System.out.println("returned:" + result);
		}
	}
}
