package oiwa.atcoder.beginner189.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 15\r\n"
						+ "200 5\r\n"
						+ "350 3\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"2 10\r\n"
						+ "200 5\r\n"
						+ "350 3\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"3 1000000\r\n"
						+ "1000 100\r\n"
						+ "1000 100\r\n"
						+ "1000 100\r\n"
						+ "",
						"-1\r\n"
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
