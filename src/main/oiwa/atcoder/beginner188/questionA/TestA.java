package oiwa.atcoder.beginner188.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 5\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"16 2\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"12 15\r\n"
						+ "",
						"No\r\n"
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
