package oiwa.atcoder.beginner230.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 3\r\n"
						+ "1 2\r\n"
						+ "4 7\r\n"
						+ "5 9\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"3 3\r\n"
						+ "1 2\r\n"
						+ "4 7\r\n"
						+ "4 9\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"5 2\r\n"
						+ "1 100\r\n"
						+ "1 1000000000\r\n"
						+ "101 1000\r\n"
						+ "9982 44353\r\n"
						+ "1000000000 1000000000\r\n"
						+ "",
						"3\r\n"
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
