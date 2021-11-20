package oiwa.atcoder.beginner228.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"7 20 12\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"20 7 12\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"23 0 23\r\n"
						+ "",
						"Yes\r\n"
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
