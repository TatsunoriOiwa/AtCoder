package oiwa.atcoder.y21q2.beginner204.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 1\r\n"
						+ "1 2 2 3\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"2 3\r\n"
						+ "1 2 2 3\r\n"
						+ "1 2 2 1\r\n"
						+ "1 1 1 1\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"4 2\r\n"
						+ "1 2 3 4\r\n"
						+ "3 4 5 6\r\n"
						+ "",
						"-1\r\n"
						+ ""),
				new Case(true,
						"6 9\r\n"
						+ "1 1 0 0\r\n"
						+ "1 3 1 2\r\n"
						+ "1 5 2 3\r\n"
						+ "5 2 16 5\r\n"
						+ "2 6 1 10\r\n"
						+ "3 4 3 4\r\n"
						+ "3 5 3 10\r\n"
						+ "5 6 1 100\r\n"
						+ "4 2 0 110\r\n"
						+ "",
						"20\r\n"
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
