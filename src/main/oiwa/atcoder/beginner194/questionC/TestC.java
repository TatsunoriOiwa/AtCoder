package oiwa.atcoder.beginner194.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "2 8 4\r\n"
						+ "",
						"56\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "-5 8 9 -4 -3\r\n"
						+ "",
						"950\r\n"
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
		});
	}
}
