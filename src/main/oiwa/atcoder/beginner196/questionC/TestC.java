package oiwa.atcoder.beginner196.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"33\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"1333\r\n"
						+ "",
						"13\r\n"
						+ ""),
				new Case(true,
						"10000000\r\n"
						+ "",
						"999\r\n"
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
