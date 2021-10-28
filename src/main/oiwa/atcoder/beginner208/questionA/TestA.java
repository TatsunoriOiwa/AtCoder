package oiwa.atcoder.beginner208.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestA {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2 11\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"2 13\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"100 600\r\n"
						+ "",
						"Yes\r\n"
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
