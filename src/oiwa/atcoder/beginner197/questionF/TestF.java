package oiwa.atcoder.beginner197.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestF {
	public static void main(String[] args) {
		new Tester(Main.class, new Case[] {
				
				new Case(true,
						"8 8\r\n"
						+ "1 2 a\r\n"
						+ "2 3 b\r\n"
						+ "1 3 c\r\n"
						+ "3 4 b\r\n"
						+ "4 5 a\r\n"
						+ "5 6 c\r\n"
						+ "6 7 b\r\n"
						+ "7 8 a\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"4 5\r\n"
						+ "1 1 a\r\n"
						+ "1 2 a\r\n"
						+ "2 3 a\r\n"
						+ "3 4 b\r\n"
						+ "4 4 a\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"3 4\r\n"
						+ "1 1 a\r\n"
						+ "1 2 a\r\n"
						+ "2 3 b\r\n"
						+ "3 3 b\r\n"
						+ "",
						"-1\r\n"
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
