package oiwa.atcoder.beginner231.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 2\r\n"
						+ "1 3\r\n"
						+ "2 3\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"4 3\r\n"
						+ "1 4\r\n"
						+ "2 4\r\n"
						+ "3 4\r\n"
						+ "",
						"No\r\n"
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
		});
	}
}
