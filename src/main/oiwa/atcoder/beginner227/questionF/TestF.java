package oiwa.atcoder.beginner227.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"1 3 2\r\n"
						+ "3 4 5\r\n"
						+ "",
						"9\r\n"
						+ ""),
				new Case(true,
						"2 2 1\r\n"
						+ "3 2\r\n"
						+ "4 3\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"3 5 3\r\n"
						+ "4 7 8 6 4\r\n"
						+ "6 7 3 10 2\r\n"
						+ "3 8 1 10 4\r\n"
						+ "",
						"21\r\n"
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
