package oiwa.atcoder.beginner191.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 4\r\n"
						+ "1 2 5\r\n"
						+ "2 3 10\r\n"
						+ "3 1 15\r\n"
						+ "4 3 20\r\n"
						+ "",
						"30\r\n"
						+ "30\r\n"
						+ "30\r\n"
						+ "-1\r\n"
						+ ""),
				new Case(true,
						"4 6\r\n"
						+ "1 2 5\r\n"
						+ "1 3 10\r\n"
						+ "2 4 5\r\n"
						+ "3 4 10\r\n"
						+ "4 1 10\r\n"
						+ "1 1 10\r\n"
						+ "",
						"10\r\n"
						+ "20\r\n"
						+ "30\r\n"
						+ "20\r\n"
						+ ""),
				new Case(true,
						"4 7\r\n"
						+ "1 2 10\r\n"
						+ "2 3 30\r\n"
						+ "1 4 15\r\n"
						+ "3 4 25\r\n"
						+ "3 4 20\r\n"
						+ "4 3 20\r\n"
						+ "4 3 30\r\n"
						+ "",
						"-1\r\n"
						+ "-1\r\n"
						+ "40\r\n"
						+ "40\r\n"
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
