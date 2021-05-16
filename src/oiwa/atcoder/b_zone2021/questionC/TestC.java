package oiwa.atcoder.b_zone2021.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestC {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case(true,
						"3\r\n"
						+ "3 9 6 4 6\r\n"
						+ "6 9 3 1 1\r\n"
						+ "8 8 9 3 7\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "6 13 6 19 11\r\n"
						+ "4 4 12 11 18\r\n"
						+ "20 7 19 2 5\r\n"
						+ "15 5 12 20 7\r\n"
						+ "8 7 6 18 5\r\n"
						+ "",
						"13\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "6 7 5 18 2\r\n"
						+ "3 8 1 6 3\r\n"
						+ "7 2 8 7 7\r\n"
						+ "6 3 3 4 7\r\n"
						+ "12 8 9 15 9\r\n"
						+ "9 8 6 1 10\r\n"
						+ "12 9 7 8 2\r\n"
						+ "10 3 17 4 10\r\n"
						+ "3 1 3 19 3\r\n"
						+ "3 14 7 13 1\r\n"
						+ "",
						"10\r\n"
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
