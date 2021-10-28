package oiwa.atcoder.beginner206.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"8\r\n"
						+ "1 5 3 2 5 2 3 1\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"7\r\n"
						+ "1 2 3 4 1 2 3\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "200000\r\n"
						+ "",
						"0\r\n"
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
