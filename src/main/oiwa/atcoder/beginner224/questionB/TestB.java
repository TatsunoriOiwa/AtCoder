package oiwa.atcoder.beginner224.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 3\r\n"
						+ "2 1 4\r\n"
						+ "3 1 3\r\n"
						+ "6 4 1\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"2 4\r\n"
						+ "4 3 2 1\r\n"
						+ "5 6 7 8\r\n"
						+ "",
						"No\r\n"
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
