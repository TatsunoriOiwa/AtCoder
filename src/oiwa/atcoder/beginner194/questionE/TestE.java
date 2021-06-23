package oiwa.atcoder.beginner194.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestE {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3 2\r\n"
						+ "0 0 1\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"3 2\r\n"
						+ "1 1 1\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"3 2\r\n"
						+ "0 1 0\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"7 3\r\n"
						+ "0 0 1 2 0 1 0\r\n"
						+ "",
						"2\r\n"
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
