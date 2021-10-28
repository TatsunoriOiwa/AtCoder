package oiwa.atcoder.beginner196.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2 2 1 2\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"3 3 4 1\r\n"
						+ "",
						"18\r\n"
						+ ""),
				new Case(true,
						"4 4 8 0\r\n"
						+ "",
						"36\r\n"
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
