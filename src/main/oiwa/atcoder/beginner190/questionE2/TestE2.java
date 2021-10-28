package oiwa.atcoder.beginner190.questionE2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 3\r\n"
						+ "1 4\r\n"
						+ "2 4\r\n"
						+ "3 4\r\n"
						+ "3\r\n"
						+ "1 2 3\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"4 3\r\n"
						+ "1 4\r\n"
						+ "2 4\r\n"
						+ "1 2\r\n"
						+ "3\r\n"
						+ "1 2 3\r\n"
						+ "",
						"-1\r\n"
						+ ""),
				new Case(true,
						"10 10\r\n"
						+ "3 9\r\n"
						+ "3 8\r\n"
						+ "8 10\r\n"
						+ "2 10\r\n"
						+ "5 8\r\n"
						+ "6 8\r\n"
						+ "5 7\r\n"
						+ "6 7\r\n"
						+ "1 6\r\n"
						+ "2 4\r\n"
						+ "4\r\n"
						+ "1 2 7 9\r\n"
						+ "",
						"11\r\n"
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
