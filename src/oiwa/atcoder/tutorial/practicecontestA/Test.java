package oiwa.atcoder.tutorial.practicecontestA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class Test {
	
	public static Case[] cases = new Case[] {
			new Case("1\r\n"
					+ "2 3\r\n"
					+ "test\r\n"
					+ "",
					"6 test\r\n"
					+ ""),
	};
	
	public static void main(String[] args) {
		new Tester(Main::main, cases);
	}
}
