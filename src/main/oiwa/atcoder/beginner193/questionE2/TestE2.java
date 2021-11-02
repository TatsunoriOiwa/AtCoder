package oiwa.atcoder.beginner193.questionE2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "5 2 7 6\r\n"
						+ "1 1 3 1\r\n"
						+ "999999999 1 1000000000 1\r\n"
						+ "",
						"20\r\n"
						+ "infinity\r\n"
						+ "1000000000999999999\r\n"
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
