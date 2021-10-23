package oiwa.atcoder.beginner224.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 3 7\r\n"
						+ "1 1 4\r\n"
						+ "1 2 7\r\n"
						+ "2 1 3\r\n"
						+ "2 3 5\r\n"
						+ "3 1 2\r\n"
						+ "3 2 5\r\n"
						+ "3 3 5\r\n"
						+ "",
						"1\r\n"
						+ "0\r\n"
						+ "2\r\n"
						+ "0\r\n"
						+ "3\r\n"
						+ "1\r\n"
						+ "0\r\n"
						+ ""),
				new Case(true,
						"5 7 20\r\n"
						+ "2 7 8\r\n"
						+ "2 6 4\r\n"
						+ "4 1 9\r\n"
						+ "1 5 4\r\n"
						+ "2 2 7\r\n"
						+ "5 5 2\r\n"
						+ "1 7 2\r\n"
						+ "4 6 6\r\n"
						+ "1 4 1\r\n"
						+ "2 1 10\r\n"
						+ "5 6 9\r\n"
						+ "5 3 3\r\n"
						+ "3 7 9\r\n"
						+ "3 6 3\r\n"
						+ "4 3 4\r\n"
						+ "3 3 10\r\n"
						+ "4 2 1\r\n"
						+ "3 5 4\r\n"
						+ "1 2 6\r\n"
						+ "4 7 9\r\n"
						+ "",
						"2\r\n"
						+ "4\r\n"
						+ "1\r\n"
						+ "5\r\n"
						+ "3\r\n"
						+ "6\r\n"
						+ "6\r\n"
						+ "2\r\n"
						+ "7\r\n"
						+ "0\r\n"
						+ "0\r\n"
						+ "4\r\n"
						+ "1\r\n"
						+ "5\r\n"
						+ "3\r\n"
						+ "0\r\n"
						+ "5\r\n"
						+ "2\r\n"
						+ "4\r\n"
						+ "0\r\n"
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
