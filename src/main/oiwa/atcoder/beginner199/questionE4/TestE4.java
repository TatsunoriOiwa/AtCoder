package oiwa.atcoder.beginner199.questionE4;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE4 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 1\r\n"
						+ "2 2 1\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"5 2\r\n"
						+ "3 3 2\r\n"
						+ "4 4 3\r\n"
						+ "",
						"90\r\n"
						+ ""),
				new Case(true,
						"18 0\r\n"
						+ "",
						"6402373705728000\r\n"
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
