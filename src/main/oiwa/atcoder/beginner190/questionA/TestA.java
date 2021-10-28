package oiwa.atcoder.beginner190.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 1 0\r\n"
						+ "",
						"Takahashi\r\n"
						+ ""),
				new Case(true,
						"2 2 0\r\n"
						+ "",
						"Aoki\r\n"
						+ ""),
				new Case(true,
						"2 2 1\r\n"
						+ "",
						"Takahashi\r\n"
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
