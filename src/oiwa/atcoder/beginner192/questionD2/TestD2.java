package oiwa.atcoder.beginner192.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"22\r\n"
						+ "10\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"999\r\n"
						+ "1500\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"100000000000000000000000000000000000000000000000000000000000\r\n"
						+ "1000000000000000000\r\n"
						+ "",
						"1\r\n"
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
