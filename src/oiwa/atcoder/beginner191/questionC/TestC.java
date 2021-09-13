package oiwa.atcoder.beginner191.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5 5\r\n"
						+ ".....\r\n"
						+ ".###.\r\n"
						+ ".###.\r\n"
						+ ".###.\r\n"
						+ ".....\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ ".....\r\n"
						+ ".#.#.\r\n"
						+ ".###.\r\n"
						+ ".###.\r\n"
						+ ".....\r\n"
						+ "",
						"8\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ ".....\r\n"
						+ ".#...\r\n"
						+ ".....\r\n"
						+ ".....\r\n"
						+ ".....\r\n"
						+ "",
						"4\r\n"
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
