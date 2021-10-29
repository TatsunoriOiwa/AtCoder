package oiwa.atcoder.beginner187.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"6\r\n"
						+ "a\r\n"
						+ "!a\r\n"
						+ "b\r\n"
						+ "!c\r\n"
						+ "d\r\n"
						+ "!d\r\n"
						+ "",
						"a\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "red\r\n"
						+ "red\r\n"
						+ "red\r\n"
						+ "!orange\r\n"
						+ "yellow\r\n"
						+ "!blue\r\n"
						+ "cyan\r\n"
						+ "!green\r\n"
						+ "brown\r\n"
						+ "!gray\r\n"
						+ "",
						"satisfiable\r\n"
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
