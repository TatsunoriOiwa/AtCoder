package oiwa.atcoder.beginner230.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"xoxxoxxo\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"xxoxxoxo\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"ox\r\n"
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
