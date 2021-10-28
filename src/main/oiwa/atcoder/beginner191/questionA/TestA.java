package oiwa.atcoder.beginner191.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"10 3 5 20\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"10 3 5 30\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
