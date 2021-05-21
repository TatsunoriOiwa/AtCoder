package oiwa.atcoder.beginner197.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestE {
	public static void main(String[] args) {
		new Tester(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "2 2\r\n"
						+ "3 1\r\n"
						+ "1 3\r\n"
						+ "4 2\r\n"
						+ "5 3\r\n"
						+ "",
						"12\r\n"
						+ ""),
				new Case(true,
						"9\r\n"
						+ "5 5\r\n"
						+ "-4 4\r\n"
						+ "4 3\r\n"
						+ "6 3\r\n"
						+ "-5 5\r\n"
						+ "-3 2\r\n"
						+ "2 2\r\n"
						+ "3 3\r\n"
						+ "1 4\r\n"
						+ "",
						"38\r\n"
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
