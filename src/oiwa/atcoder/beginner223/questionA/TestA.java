package oiwa.atcoder.beginner223.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"500\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"40\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"0\r\n"
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
		});
	}
}
