package oiwa.atcoder.beginner224.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "0 1\r\n"
						+ "1 3\r\n"
						+ "1 1\r\n"
						+ "-1 -1\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"20\r\n"
						+ "224 433\r\n"
						+ "987654321 987654321\r\n"
						+ "2 0\r\n"
						+ "6 4\r\n"
						+ "314159265 358979323\r\n"
						+ "0 0\r\n"
						+ "-123456789 123456789\r\n"
						+ "-1000000000 1000000000\r\n"
						+ "124 233\r\n"
						+ "9 -6\r\n"
						+ "-4 0\r\n"
						+ "9 5\r\n"
						+ "-7 3\r\n"
						+ "333333333 -333333333\r\n"
						+ "-9 -1\r\n"
						+ "7 -10\r\n"
						+ "-1 5\r\n"
						+ "324 633\r\n"
						+ "1000000000 -1000000000\r\n"
						+ "20 0\r\n"
						+ "",
						"1124\r\n"
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
