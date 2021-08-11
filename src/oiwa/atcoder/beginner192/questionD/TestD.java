package oiwa.atcoder.beginner192.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
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
						"1\r\n"
						+ "100\r\n",
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
