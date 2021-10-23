package oiwa.atcoder.beginner224.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "1 9\r\n"
						+ "2 9\r\n"
						+ "3 9\r\n"
						+ "3 9 2 4 5 6 7 8\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(false,
						"5\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "1 9\r\n"
						+ "2 9\r\n"
						+ "3 9\r\n"
						+ "1 2 3 4 5 6 7 8\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(false,
						"12\r\n"
						+ "8 5\r\n"
						+ "9 6\r\n"
						+ "4 5\r\n"
						+ "4 1\r\n"
						+ "2 5\r\n"
						+ "8 9\r\n"
						+ "2 1\r\n"
						+ "3 6\r\n"
						+ "8 7\r\n"
						+ "6 5\r\n"
						+ "7 4\r\n"
						+ "2 3\r\n"
						+ "1 2 3 4 5 6 8 7\r\n"
						+ "",
						"-1\r\n"
						+ ""),
				new Case(true,
						"12\r\n"
						+ "6 5\r\n"
						+ "5 4\r\n"
						+ "4 1\r\n"
						+ "4 7\r\n"
						+ "8 5\r\n"
						+ "2 1\r\n"
						+ "2 5\r\n"
						+ "6 9\r\n"
						+ "3 6\r\n"
						+ "9 8\r\n"
						+ "8 7\r\n"
						+ "3 2\r\n"
						+ "2 3 4 6 1 9 7 8\r\n"
						+ "",
						"16\r\n"
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
