package oiwa.atcoder.beginner200.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "180 186 189 191 218\r\n"
						+ "",
						"Yes\r\n"
						+ "1 1\r\n"
						+ "2 3 4\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "123 523\r\n"
						+ "",
						"Yes\r\n"
						+ "1 1\r\n"
						+ "1 2\r\n"
						+ ""),
				new Case(true,
						"6\r\n"
						+ "2013 1012 2765 2021 508 6971\r\n"
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
		});
	}
}
