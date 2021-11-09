package oiwa.atcoder.beginner185.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 4\r\n"
						+ "1 2 3\r\n"
						+ "2 1 3\r\n"
						+ "2 2 3\r\n"
						+ "1 2 3\r\n"
						+ "2 2 3\r\n"
						+ "",
						"0\r\n"
						+ "1\r\n"
						+ "2\r\n"
						+ ""),
				new Case(true,
						"10 10\r\n"
						+ "0 5 3 4 7 0 0 0 1 0\r\n"
						+ "1 10 7\r\n"
						+ "2 8 9\r\n"
						+ "2 3 6\r\n"
						+ "2 1 6\r\n"
						+ "2 1 10\r\n"
						+ "1 9 4\r\n"
						+ "1 6 1\r\n"
						+ "1 6 3\r\n"
						+ "1 1 7\r\n"
						+ "2 3 5\r\n"
						+ "",
						"1\r\n"
						+ "0\r\n"
						+ "5\r\n"
						+ "3\r\n"
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
