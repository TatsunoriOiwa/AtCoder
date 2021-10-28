package oiwa.atcoder.beginner187.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "2 4\r\n"
						+ "4 5\r\n"
						+ "4\r\n"
						+ "1 1 1\r\n"
						+ "1 4 10\r\n"
						+ "2 1 100\r\n"
						+ "2 2 1000\r\n"
						+ "",
						"11\r\n"
						+ "110\r\n"
						+ "1110\r\n"
						+ "110\r\n"
						+ "100\r\n"
						+ ""),
				new Case(true,
						"7\r\n"
						+ "2 1\r\n"
						+ "2 3\r\n"
						+ "4 2\r\n"
						+ "4 5\r\n"
						+ "6 1\r\n"
						+ "3 7\r\n"
						+ "7\r\n"
						+ "2 2 1\r\n"
						+ "1 3 2\r\n"
						+ "2 2 4\r\n"
						+ "1 6 8\r\n"
						+ "1 3 16\r\n"
						+ "2 4 32\r\n"
						+ "2 1 64\r\n"
						+ "",
						"72\r\n"
						+ "8\r\n"
						+ "13\r\n"
						+ "26\r\n"
						+ "58\r\n"
						+ "72\r\n"
						+ "5\r\n"
						+ ""),
				new Case(true,
						"11\r\n"
						+ "2 1\r\n"
						+ "1 3\r\n"
						+ "3 4\r\n"
						+ "5 2\r\n"
						+ "1 6\r\n"
						+ "1 7\r\n"
						+ "5 8\r\n"
						+ "3 9\r\n"
						+ "3 10\r\n"
						+ "11 4\r\n"
						+ "10\r\n"
						+ "2 6 688\r\n"
						+ "1 10 856\r\n"
						+ "1 8 680\r\n"
						+ "1 8 182\r\n"
						+ "2 2 452\r\n"
						+ "2 4 183\r\n"
						+ "2 6 518\r\n"
						+ "1 3 612\r\n"
						+ "2 6 339\r\n"
						+ "2 3 206\r\n"
						+ "",
						"1657\r\n"
						+ "1657\r\n"
						+ "2109\r\n"
						+ "1703\r\n"
						+ "1474\r\n"
						+ "1657\r\n"
						+ "3202\r\n"
						+ "1474\r\n"
						+ "1247\r\n"
						+ "2109\r\n"
						+ "2559\r\n"
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
		});
	}
}
