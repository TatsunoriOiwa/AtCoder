package oiwa.atcoder.beginner198.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestD {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case("a\r\n"
						+ "b\r\n"
						+ "c\r\n"
						+ "",
						"1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ ""),
				new Case("x\r\n"
						+ "x\r\n"
						+ "y\r\n"
						+ "",
						"1\r\n"
						+ "1\r\n"
						+ "2\r\n"
						+ ""),
				new Case("p\r\n"
						+ "q\r\n"
						+ "p\r\n"
						+ "",
						"UNSOLVABLE\r\n"
						+ ""),
				new Case("abcd\r\n"
						+ "efgh\r\n"
						+ "ijkl\r\n"
						+ "",
						"UNSOLVABLE\r\n"
						+ ""),
				new Case("send\r\n"
						+ "more\r\n"
						+ "money\r\n"
						+ "",
						"9567\r\n"
						+ "1085\r\n"
						+ "10652\r\n"
						+ ""),
		});
	}
}
