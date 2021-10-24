package oiwa.atcoder.beginner188.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2\r\n"
						+ "-3 6\r\n"
						+ "4 2\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "4 5\r\n"
						+ "-1 -3\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "1 3 5\r\n"
						+ "3 -6 3\r\n"
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
		});
	}
}
