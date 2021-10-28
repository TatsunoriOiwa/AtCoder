package oiwa.atcoder.beginner188.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2\r\n"
						+ "1 4 2 5\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "3 1 5 4\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "6 13 12 5 3 7 10 11 16 9 8 15 2 1 14 4\r\n"
						+ "",
						"2\r\n"
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
		});
	}
}
