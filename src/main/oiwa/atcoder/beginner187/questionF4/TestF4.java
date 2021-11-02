package oiwa.atcoder.beginner187.questionF4;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF4 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 2\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"4 6\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "1 4\r\n"
						+ "2 3\r\n"
						+ "2 4\r\n"
						+ "3 4\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"10 11\r\n"
						+ "9 10\r\n"
						+ "2 10\r\n"
						+ "8 9\r\n"
						+ "3 4\r\n"
						+ "5 8\r\n"
						+ "1 8\r\n"
						+ "5 6\r\n"
						+ "2 5\r\n"
						+ "3 6\r\n"
						+ "6 9\r\n"
						+ "1 9\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"18 0\r\n"
						+ "",
						"18\r\n"
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
