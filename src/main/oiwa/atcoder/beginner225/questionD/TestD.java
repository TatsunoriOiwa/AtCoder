package oiwa.atcoder.beginner225.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"7 14\r\n"
						+ "1 6 3\r\n"
						+ "1 4 1\r\n"
						+ "1 5 2\r\n"
						+ "1 2 7\r\n"
						+ "1 3 5\r\n"
						+ "3 2\r\n"
						+ "3 4\r\n"
						+ "3 6\r\n"
						+ "2 3 5\r\n"
						+ "2 4 1\r\n"
						+ "1 1 5\r\n"
						+ "3 2\r\n"
						+ "3 4\r\n"
						+ "3 6\r\n"
						+ "",
						"5 6 3 5 2 7\r\n"
						+ "2 4 1\r\n"
						+ "5 6 3 5 2 7\r\n"
						+ "4 1 5 2 7\r\n"
						+ "1 4\r\n"
						+ "2 6 3\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
