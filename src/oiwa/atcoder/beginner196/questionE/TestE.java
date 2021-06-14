package oiwa.atcoder.beginner196.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestE {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "-10 2\r\n"
						+ "10 1\r\n"
						+ "10 3\r\n"
						+ "5\r\n"
						+ "-15 -10 -5 0 5\r\n"
						+ "",
						"0\r\n"
						+ "0\r\n"
						+ "5\r\n"
						+ "10\r\n"
						+ "10\r\n"
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
