package oiwa.atcoder.beginner185.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 3\r\n"
						+ "1 2 1 3\r\n"
						+ "1 3 1\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"4 6\r\n"
						+ "1 3 2 4\r\n"
						+ "1 5 2 6 4 3\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ "1 1 1 1 1\r\n"
						+ "2 2 2 2 2\r\n"
						+ "",
						"5\r\n"
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
