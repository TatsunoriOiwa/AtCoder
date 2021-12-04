package oiwa.atcoder.beginner229.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 5\r\n"
						+ "3 1\r\n"
						+ "4 2\r\n"
						+ "2 3\r\n"
						+ "",
						"15\r\n"
						+ ""),
				new Case(true,
						"4 100\r\n"
						+ "6 2\r\n"
						+ "1 5\r\n"
						+ "3 9\r\n"
						+ "8 7\r\n"
						+ "",
						"100\r\n"
						+ ""),
				new Case(true,
						"10 3141\r\n"
						+ "314944731 649\r\n"
						+ "140276783 228\r\n"
						+ "578012421 809\r\n"
						+ "878510647 519\r\n"
						+ "925326537 943\r\n"
						+ "337666726 611\r\n"
						+ "879137070 306\r\n"
						+ "87808915 39\r\n"
						+ "756059990 244\r\n"
						+ "228622672 291\r\n"
						+ "",
						"2357689932073\r\n"
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
