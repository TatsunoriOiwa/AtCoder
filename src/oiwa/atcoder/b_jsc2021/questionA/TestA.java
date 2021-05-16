package oiwa.atcoder.b_jsc2021.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestA {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case(true,
						"100 200 100\r\n"
						+ "",
						"199\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
