package oiwa.atcoder.beginner198.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestE {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case("6\r\n"
						+ "2 7 1 8 2 8\r\n"
						+ "1 2\r\n"
						+ "3 6\r\n"
						+ "3 2\r\n"
						+ "4 3\r\n"
						+ "2 5\r\n"
						+ "",
						"1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ "4\r\n"
						+ "6\r\n"
						+ ""),
				new Case("10\r\n"
						+ "3 1 4 1 5 9 2 6 5 3\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "3 4\r\n"
						+ "4 5\r\n"
						+ "5 6\r\n"
						+ "6 7\r\n"
						+ "7 8\r\n"
						+ "8 9\r\n"
						+ "9 10\r\n"
						+ "",
						"1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ "5\r\n"
						+ "6\r\n"
						+ "7\r\n"
						+ "8\r\n"
						+ ""),
//				new Case("",
//						""),
		});
	}
}
