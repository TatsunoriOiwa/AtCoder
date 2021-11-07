package oiwa.atcoder.beginner226.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 2\r\n"
						+ "3 6\r\n"
						+ "7 4\r\n"
						+ "",
						"6\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "1 2\r\n"
						+ "2 2\r\n"
						+ "4 2\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "0 0\r\n"
						+ "0 1000000000\r\n"
						+ "1000000000 0\r\n"
						+ "1000000000 1000000000\r\n"
						+ "",
						"8\r\n"
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
