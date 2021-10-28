package oiwa.atcoder.beginner205.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"4 3\r\n"
						+ "3 5 6 7\r\n"
						+ "2\r\n"
						+ "5\r\n"
						+ "3\r\n"
						+ "",
						"2\r\n"
						+ "9\r\n"
						+ "4\r\n"
						+ ""),
				new Case(true,
						"5 2\r\n"
						+ "1 2 3 4 5\r\n"
						+ "1\r\n"
						+ "10\r\n"
						+ "",
						"6\r\n"
						+ "15\r\n"
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
		});
	}
}
