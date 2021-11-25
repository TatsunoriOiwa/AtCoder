package oiwa.atcoder.beginner200.questionE3;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE3 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 5\r\n"
						+ "",
						"1 2 2\r\n"
						+ ""),
				new Case(true,
						"2 1\r\n"
						+ "",
						"1 1 1\r\n"
						+ ""),
				new Case(true,
						"2 2\r\n"
						+ "",
						"1 1 2\r\n"
						+ ""),
				new Case(true,
						"2 3\r\n"
						+ "",
						"1 2 1\r\n"
						+ ""),
				new Case(true,
						"2 4\r\n"
						+ "",
						"2 1 1\r\n"
						+ ""),
				new Case(true,
						"2 8\r\n"
						+ "",
						"2 2 2\r\n"
						+ ""),

				new Case(true,
						"1000000 1000000000000000000\r\n"
						+ "",
						"1000000 1000000 1000000\r\n"
						+ ""),
				new Case(true,
						"9 47\r\n"
						+ "",
						"3 1 4\r\n"
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
