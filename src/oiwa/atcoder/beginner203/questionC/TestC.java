package oiwa.atcoder.beginner203.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2 3\r\n"
						+ "2 1\r\n"
						+ "5 10\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"5 1000000000\r\n"
						+ "1 1000000000\r\n"
						+ "2 1000000000\r\n"
						+ "3 1000000000\r\n"
						+ "4 1000000000\r\n"
						+ "5 1000000000\r\n"
						+ "",
						"6000000000\r\n"
						+ ""),
				new Case(true,
						"3 2\r\n"
						+ "5 5\r\n"
						+ "2 1\r\n"
						+ "2 2\r\n"
						+ "",
						"10\r\n"
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
