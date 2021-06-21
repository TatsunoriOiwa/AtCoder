package oiwa.atcoder.beginner206.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 7 1\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "1 10 100 1000 10000 100000 1000000 10000000 100000000 1000000000\r\n"
						+ "",
						"45\r\n"
						+ ""),
				new Case(true,
						"20\r\n"
						+ "7 8 1 1 4 9 9 6 8 2 4 1 1 9 5 5 5 3 6 4\r\n"
						+ "",
						"173\r\n"
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
