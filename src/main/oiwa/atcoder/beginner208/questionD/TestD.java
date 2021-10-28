package oiwa.atcoder.beginner208.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3 2\r\n"
						+ "1 2 3\r\n"
						+ "2 3 2\r\n"
						+ "",
						"25\r\n"
						+ ""),
				new Case(true,
						"3 0\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"5 20\r\n"
						+ "1 2 6\r\n"
						+ "1 3 10\r\n"
						+ "1 4 4\r\n"
						+ "1 5 1\r\n"
						+ "2 1 5\r\n"
						+ "2 3 9\r\n"
						+ "2 4 8\r\n"
						+ "2 5 6\r\n"
						+ "3 1 5\r\n"
						+ "3 2 1\r\n"
						+ "3 4 7\r\n"
						+ "3 5 9\r\n"
						+ "4 1 4\r\n"
						+ "4 2 6\r\n"
						+ "4 3 4\r\n"
						+ "4 5 8\r\n"
						+ "5 1 2\r\n"
						+ "5 2 5\r\n"
						+ "5 3 6\r\n"
						+ "5 4 5\r\n"
						+ "",
						"517\r\n"
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
