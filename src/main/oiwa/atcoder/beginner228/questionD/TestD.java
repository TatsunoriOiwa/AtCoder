package oiwa.atcoder.beginner228.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "1 1048577\r\n"
						+ "1 1\r\n"
						+ "2 2097153\r\n"
						+ "2 3\r\n"
						+ "",
						"1048577\r\n"
						+ "-1\r\n"
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
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
