package oiwa.atcoder.beginner214.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 2 10\r\n"
						+ "2 3 20\r\n"
						+ "",
						"50\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "1 2 1\r\n"
						+ "2 3 2\r\n"
						+ "4 2 5\r\n"
						+ "3 5 14\r\n"
						+ "",
						"76\r\n"
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
