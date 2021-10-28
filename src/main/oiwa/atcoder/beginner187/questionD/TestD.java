package oiwa.atcoder.beginner187.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "2 1\r\n"
						+ "2 2\r\n"
						+ "5 1\r\n"
						+ "1 3\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "2 1\r\n"
						+ "2 1\r\n"
						+ "2 1\r\n"
						+ "2 1\r\n"
						+ "2 1\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "273 691\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
