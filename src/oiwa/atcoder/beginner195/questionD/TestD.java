package oiwa.atcoder.beginner195.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3 4 3\r\n"
						+ "1 9\r\n"
						+ "5 3\r\n"
						+ "7 8\r\n"
						+ "1 8 6 9\r\n"
						+ "4 4\r\n"
						+ "1 4\r\n"
						+ "1 3\r\n"
						+ "",
						"20\r\n"
						+ "0\r\n"
						+ "9\r\n"
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
