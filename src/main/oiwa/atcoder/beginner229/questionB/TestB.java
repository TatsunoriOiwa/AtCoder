package oiwa.atcoder.beginner229.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"229 390\r\n"
						+ "",
						"Hard\r\n"
						+ ""),
				new Case(true,
						"123456789 9876543210\r\n"
						+ "",
						"Easy\r\n"
						+ ""),
				new Case(true,
						"1 12349",
						"Hard"),
				new Case(true,
						"1 12300",
						"Easy"),
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
