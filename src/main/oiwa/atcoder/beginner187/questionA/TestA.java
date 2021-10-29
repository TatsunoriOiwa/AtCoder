package oiwa.atcoder.beginner187.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"123 234\r\n"
						+ "",
						"9\r\n"
						+ ""),
				new Case(true,
						"593 953\r\n"
						+ "",
						"17\r\n"
						+ ""),
				new Case(true,
						"100 999\r\n"
						+ "",
						"27\r\n"
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
