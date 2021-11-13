package oiwa.atcoder.beginner227.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 3 2\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"1 100 1\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"3 14 2\r\n"
						+ "",
						"3\r\n"
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
