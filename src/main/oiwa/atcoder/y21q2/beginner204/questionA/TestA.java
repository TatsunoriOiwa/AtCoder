package oiwa.atcoder.y21q2.beginner204.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"0 1\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"0 0\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"1 0\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"2 0\r\n"
						+ "",
						"1\r\n"
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
				new Case(false,
						"",
						""),
		});
	}
}
