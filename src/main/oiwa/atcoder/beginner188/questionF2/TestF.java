package oiwa.atcoder.beginner188.questionF2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 9\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"7 11\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"1000000000000000000 1000000000000000000\r\n"
						+ "",
						"0\r\n"
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
