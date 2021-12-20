package oiwa.atcoder.beginner231.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"1000\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"50\r\n"
						+ "",
						"0.5\r\n"
						+ ""),
				new Case(true,
						"3141\r\n"
						+ "",
						"31.41\r\n"
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
