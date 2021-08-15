package oiwa.atcoder.beginner214.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2\r\n"
						+ "3\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "3 3\r\n"
						+ "5\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "3 3\r\n"
						+ "1 3\r\n"
						+ "999999999 1000000000\r\n"
						+ "",
						"Yes\r\n"
						+ "No\r\n"
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
