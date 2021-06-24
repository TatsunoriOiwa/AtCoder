package oiwa.atcoder.beginner193.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"8\r\n"
						+ "",
						"6\r\n"
						+ ""),
				new Case(true,
						"100000\r\n"
						+ "",
						"99634\r\n"
						+ ""),
				new Case(true,
						"10000000000",
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
