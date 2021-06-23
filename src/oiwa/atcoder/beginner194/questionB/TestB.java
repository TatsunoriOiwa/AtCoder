package oiwa.atcoder.beginner194.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestB {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "8 5\r\n"
						+ "4 4\r\n"
						+ "7 9\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "11 7\r\n"
						+ "3 2\r\n"
						+ "6 7\r\n"
						+ "",
						"5\r\n"
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
