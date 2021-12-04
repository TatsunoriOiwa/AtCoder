package oiwa.atcoder.beginner230.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5 3 2\r\n"
						+ "1 5 1 5\r\n"
						+ "",
						"...#.\r\n"
						+ "#.#..\r\n"
						+ ".#...\r\n"
						+ "#.#..\r\n"
						+ "...#.\r\n"
						+ ""),
				new Case(true,
						"5 3 3\r\n"
						+ "4 5 2 5\r\n"
						+ "",
						"#.#.\r\n"
						+ "...#\r\n"
						+ ""),
				new Case(true,
						"1000000000000000000 999999999999999999 999999999999999999\r\n"
						+ "999999999999999998 1000000000000000000 999999999999999998 1000000000000000000\r\n"
						+ "",
						"#.#\r\n"
						+ ".#.\r\n"
						+ "#.#\r\n"
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
