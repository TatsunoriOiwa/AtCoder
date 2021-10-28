package oiwa.atcoder.beginner189.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"1\r\n"
						+ "1 2\r\n"
						+ "4\r\n"
						+ "1\r\n"
						+ "3 3\r\n"
						+ "2\r\n"
						+ "4 2\r\n"
						+ "5\r\n"
						+ "0 1\r\n"
						+ "1 1\r\n"
						+ "2 1\r\n"
						+ "3 1\r\n"
						+ "4 1\r\n"
						+ "",
						"1 2\r\n"
						+ "2 -1\r\n"
						+ "4 -1\r\n"
						+ "1 4\r\n"
						+ "1 0\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "1000000000 0\r\n"
						+ "0 1000000000\r\n"
						+ "4\r\n"
						+ "3 -1000000000\r\n"
						+ "4 -1000000000\r\n"
						+ "3 1000000000\r\n"
						+ "4 1000000000\r\n"
						+ "2\r\n"
						+ "4 1\r\n"
						+ "4 2\r\n"
						+ "",
						"5000000000 4000000000\r\n"
						+ "4000000000 5000000000\r\n"
						+ ""),
				new Case(false,
						"1\n"
						+ "2 3\n"
						+ "",
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
