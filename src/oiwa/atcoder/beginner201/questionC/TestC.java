package oiwa.atcoder.beginner201.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestC {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case(true,
						"ooo???xxxx\r\n"
						+ "",
						"108\r\n"
						+ ""),
				new Case(true,
						"o?oo?oxoxo\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
