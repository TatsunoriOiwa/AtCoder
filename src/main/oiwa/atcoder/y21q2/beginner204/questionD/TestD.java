package oiwa.atcoder.y21q2.beginner204.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "8 3 7 2 5\r\n"
						+ "",
						"13\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "1000 1\r\n"
						+ "",
						"1000\r\n"
						+ ""),
				new Case(true,
						"9\r\n"
						+ "3 14 15 9 26 5 35 89 79\r\n"
						+ "",
						"138\r\n"
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
