package oiwa.atcoder.beginner226.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "3 0\r\n"
						+ "5 1 1\r\n"
						+ "7 1 1\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "1000000000 0\r\n"
						+ "1000000000 0\r\n"
						+ "1000000000 0\r\n"
						+ "1000000000 0\r\n"
						+ "1000000000 4 1 2 3 4\r\n"
						+ "",
						"5000000000\r\n"
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
