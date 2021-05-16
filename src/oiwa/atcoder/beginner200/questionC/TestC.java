package oiwa.atcoder.beginner200.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestC {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case(true,
						"6\r\n"
						+ "123 223 123 523 200 2000\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "1 2 3 4 5\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"8\r\n"
						+ "199 100 200 400 300 500 600 200\r\n"
						+ "",
						"9\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "1000_000_000",
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
