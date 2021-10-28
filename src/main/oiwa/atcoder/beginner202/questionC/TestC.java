package oiwa.atcoder.beginner202.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV2;

public class TestC {
	public static void main(String[] args) {
		new TesterV2(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 2 2\r\n"
						+ "3 1 2\r\n"
						+ "2 3 2\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "1 1 1 1\r\n"
						+ "1 1 1 1\r\n"
						+ "1 2 3 4\r\n"
						+ "",
						"16\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "2 3 3\r\n"
						+ "1 3 3\r\n"
						+ "1 1 1\r\n"
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
