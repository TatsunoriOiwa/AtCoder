package oiwa.atcoder.beginner198.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"a\r\n"
						+ "b\r\n"
						+ "c\r\n"
						+ "",
						"1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ ""),
				new Case(true,
						"x\r\n"
						+ "x\r\n"
						+ "y\r\n"
						+ "",
						"1\r\n"
						+ "1\r\n"
						+ "2\r\n"
						+ ""),
				new Case(true,
						"p\r\n"
						+ "q\r\n"
						+ "p\r\n"
						+ "",
						"UNSOLVABLE\r\n"
						+ ""),
				new Case(true,
						"abcd\r\n"
						+ "efgh\r\n"
						+ "ijkl\r\n"
						+ "",
						"UNSOLVABLE\r\n"
						+ ""),
				new Case(true,
						"send\r\n"
						+ "more\r\n"
						+ "money\r\n"
						+ "",
						"9567\r\n"
						+ "1085\r\n"
						+ "10652\r\n"
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
