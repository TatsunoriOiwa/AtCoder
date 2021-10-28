package oiwa.atcoder.beginner214.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"1 0\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"2 5\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"10 10\r\n"
						+ "",
						"213\r\n"
						+ ""),
				new Case(true,
						"30 100\r\n"
						+ "",
						"2471\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
