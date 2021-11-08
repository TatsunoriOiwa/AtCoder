package oiwa.atcoder.beginner226.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "2 1 2\r\n"
						+ "2 1 1\r\n"
						+ "2 2 1\r\n"
						+ "2 1 2\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "1 1\r\n"
						+ "1 1\r\n"
						+ "1 2\r\n"
						+ "2 1 1\r\n"
						+ "3 1 1 1\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "1 1\r\n"
						+ "",
						"1\r\n"
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
