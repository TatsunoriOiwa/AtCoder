package oiwa.atcoder.beginner185.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5 2\r\n"
						+ "1 3\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"13 3\r\n"
						+ "13 3 9\r\n"
						+ "",
						"6\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ "5 2 1 4 3\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"1 0\r\n"
						+ "\r\n"
						+ "",
						"1\r\n"
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
