package oiwa.atcoder.beginner198.questionC2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5 15 0\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"5 11 0\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"3 4 4\r\n"
						+ "",
						"2\r\n"
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
