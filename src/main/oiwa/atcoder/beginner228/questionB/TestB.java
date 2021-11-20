package oiwa.atcoder.beginner228.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 2\r\n"
						+ "3 1 1 2\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"20 12\r\n"
						+ "7 11 10 1 7 20 14 2 17 3 2 5 19 20 8 14 18 2 10 10\r\n"
						+ "",
						"7\r\n"
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
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
