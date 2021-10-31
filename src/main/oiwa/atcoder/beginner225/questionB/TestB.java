package oiwa.atcoder.beginner225.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "1 4\r\n"
						+ "2 4\r\n"
						+ "3 4\r\n"
						+ "4 5\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "2 4\r\n"
						+ "1 4\r\n"
						+ "2 3\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "9 10\r\n"
						+ "3 10\r\n"
						+ "4 10\r\n"
						+ "8 10\r\n"
						+ "1 10\r\n"
						+ "2 10\r\n"
						+ "7 10\r\n"
						+ "6 10\r\n"
						+ "5 10\r\n"
						+ "",
						"Yes\r\n"
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
