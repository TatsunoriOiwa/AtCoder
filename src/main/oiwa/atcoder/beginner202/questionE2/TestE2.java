package oiwa.atcoder.beginner202.questionE2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"7\r\n"
						+ "1 1 2 2 4 2\r\n"
						+ "4\r\n"
						+ "1 2\r\n"
						+ "7 2\r\n"
						+ "4 1\r\n"
						+ "5 5\r\n"
						+ "",
						"3\r\n"
						+ "1\r\n"
						+ "0\r\n"
						+ "0\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
