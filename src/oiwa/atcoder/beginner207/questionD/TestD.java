package oiwa.atcoder.beginner207.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "0 0\r\n"
						+ "0 1\r\n"
						+ "1 0\r\n"
						+ "2 0\r\n"
						+ "3 0\r\n"
						+ "3 1\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "1 0\r\n"
						+ "1 1\r\n"
						+ "3 0\r\n"
						+ "-1 0\r\n"
						+ "-1 1\r\n"
						+ "-3 0\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "0 0\r\n"
						+ "2 9\r\n"
						+ "10 -2\r\n"
						+ "-6 -7\r\n"
						+ "0 0\r\n"
						+ "2 9\r\n"
						+ "10 -2\r\n"
						+ "-6 -7\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"6\r\n"
						+ "10 5\r\n"
						+ "-9 3\r\n"
						+ "1 -5\r\n"
						+ "-6 -5\r\n"
						+ "6 9\r\n"
						+ "-9 0\r\n"
						+ "-7 -10\r\n"
						+ "-10 -5\r\n"
						+ "5 4\r\n"
						+ "9 0\r\n"
						+ "0 -10\r\n"
						+ "-10 -2\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
