package oiwa.atcoder.beginner203.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 2\r\n"
						+ "1 7 0\r\n"
						+ "5 8 11\r\n"
						+ "10 4 2\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"3 3\r\n"
						+ "1 2 3\r\n"
						+ "4 5 6\r\n"
						+ "7 8 9\r\n"
						+ "",
						"5\r\n"
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
