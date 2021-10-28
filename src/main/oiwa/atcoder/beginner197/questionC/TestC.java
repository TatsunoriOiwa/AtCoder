package oiwa.atcoder.beginner197.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV2;

public class TestC {
	public static void main(String[] args) {
		new TesterV2(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 5 7\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "10 10 10\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "1 3 3 1\r\n"
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
