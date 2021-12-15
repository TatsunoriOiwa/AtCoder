package oiwa.atcoder.beginner203.questionE2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 4\r\n"
						+ "1 1\r\n"
						+ "1 2\r\n"
						+ "2 0\r\n"
						+ "4 2\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"1 1\r\n"
						+ "1 1\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
