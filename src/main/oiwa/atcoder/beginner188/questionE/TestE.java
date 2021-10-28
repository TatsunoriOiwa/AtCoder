package oiwa.atcoder.beginner188.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 3\r\n"
						+ "2 3 1 5\r\n"
						+ "2 4\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ "13 8 3 15 18\r\n"
						+ "2 4\r\n"
						+ "1 2\r\n"
						+ "4 5\r\n"
						+ "2 3\r\n"
						+ "1 3\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"3 1\r\n"
						+ "1 100 1\r\n"
						+ "2 3\r\n"
						+ "",
						"-99\r\n"
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
