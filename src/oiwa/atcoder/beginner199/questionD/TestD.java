package oiwa.atcoder.beginner199.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestD {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
				new Case(true,
						"4 6\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "3 4\r\n"
						+ "2 4\r\n"
						+ "1 3\r\n"
						+ "1 4\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"20 0\r\n"
						+ "",
						"3486784401\r\n"
						+ ""),
				new Case(false,
						"",
						""),
		});
	}
}
