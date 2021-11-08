package oiwa.atcoder.beginner226.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3.456\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"99.500\r\n"
						+ "",
						"100\r\n"
						+ ""),
				new Case(true,
						"0.000\r\n"
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
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
