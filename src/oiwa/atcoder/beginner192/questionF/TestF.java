package oiwa.atcoder.beginner192.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 9999999999\r\n"
						+ "3 6 8\r\n"
						+ "",
						"4999999994\r\n"
						+ ""),
				new Case(true,
						"1 1000000000000000000\r\n"
						+ "1\r\n"
						+ "",
						"999999999999999999\r\n"
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
		});
	}
}
