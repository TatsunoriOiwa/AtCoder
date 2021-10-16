package oiwa.atcoder.beginner189.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2\r\n"
						+ "AND\r\n"
						+ "OR\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "OR\r\n"
						+ "OR\r\n"
						+ "OR\r\n"
						+ "OR\r\n"
						+ "OR\r\n"
						+ "",
						"63\r\n"
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
