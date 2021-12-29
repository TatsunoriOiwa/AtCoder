package oiwa.atcoder.beginner206.questionE2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 7\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"4 10\r\n"
						+ "",
						"12\r\n"
						+ ""),
				new Case(false,
						"1 1000000\r\n"
						+ "",
						"392047955148\r\n"
						+ ""),
				new Case(true,
						"1 13",
						"18"),
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
