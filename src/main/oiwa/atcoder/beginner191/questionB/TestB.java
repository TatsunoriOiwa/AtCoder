package oiwa.atcoder.beginner191.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5 5\r\n"
						+ "3 5 6 5 4\r\n"
						+ "",
						"3 6 4\r\n"
						+ ""),
				new Case(true,
						"3 3\r\n"
						+ "3 3 3\r\n"
						+ "",
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
