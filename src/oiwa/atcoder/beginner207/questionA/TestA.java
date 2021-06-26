package oiwa.atcoder.beginner207.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestA {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3 4 5\r\n"
						+ "",
						"9\r\n"
						+ ""),
				new Case(true,
						"6 6 6\r\n"
						+ "",
						"12\r\n"
						+ ""),
				new Case(true,
						"99 99 98\r\n"
						+ "",
						"198\r\n"
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
