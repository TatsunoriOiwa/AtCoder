package oiwa.atcoder.y21q2.beginner204.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 3\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "3 2\r\n"
						+ "",
						"7\r\n"
						+ ""),
				new Case(true,
						"3 0\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"4 4\r\n"
						+ "1 2\r\n"
						+ "2 3\r\n"
						+ "3 4\r\n"
						+ "4 1\r\n"
						+ "",
						"16\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
