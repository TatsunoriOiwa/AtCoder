package oiwa.atcoder.beginner192.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 2 1 3\r\n"
						+ "1 2 2 3\r\n"
						+ "2 3 3 4\r\n"
						+ "",
						"7\r\n"
						+ ""),
				new Case(true,
						"3 2 3 1\r\n"
						+ "1 2 2 3\r\n"
						+ "2 3 3 4\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"3 0 3 1\r\n"
						+ "",
						"-1\r\n"
						+ ""),
				new Case(true,
						"9 14 6 7\r\n"
						+ "3 1 4 1\r\n"
						+ "5 9 2 6\r\n"
						+ "5 3 5 8\r\n"
						+ "9 7 9 3\r\n"
						+ "2 3 8 4\r\n"
						+ "6 2 6 4\r\n"
						+ "3 8 3 2\r\n"
						+ "7 9 5 2\r\n"
						+ "8 4 1 9\r\n"
						+ "7 1 6 9\r\n"
						+ "3 9 9 3\r\n"
						+ "7 5 1 5\r\n"
						+ "8 2 9 7\r\n"
						+ "4 9 4 4\r\n"
						+ "",
						"26\r\n"
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
