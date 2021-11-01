package oiwa.atcoder.beginner225.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"aba\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"ccc\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"xyz\r\n"
						+ "",
						"6\r\n"
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
