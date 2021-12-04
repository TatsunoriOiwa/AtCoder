package oiwa.atcoder.beginner229.questionE2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"6 7\r\n"
						+ "1 2\r\n"
						+ "1 4\r\n"
						+ "1 5\r\n"
						+ "2 4\r\n"
						+ "2 3\r\n"
						+ "3 5\r\n"
						+ "3 6\r\n"
						+ "",
						"1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ "2\r\n"
						+ "1\r\n"
						+ "0\r\n"
						+ ""),
				new Case(true,
						"8 7\r\n"
						+ "7 8\r\n"
						+ "3 4\r\n"
						+ "5 6\r\n"
						+ "5 7\r\n"
						+ "5 8\r\n"
						+ "6 7\r\n"
						+ "6 8\r\n"
						+ "",
						"3\r\n"
						+ "2\r\n"
						+ "2\r\n"
						+ "1\r\n"
						+ "1\r\n"
						+ "1\r\n"
						+ "1\r\n"
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
		});
	}
}
