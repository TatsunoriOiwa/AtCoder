package oiwa.atcoder.beginner207.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestB {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"5 2 3 2\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"6 9 2 3\r\n"
						+ "",
						"-1\r\n"
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
