package oiwa.atcoder.beginner224.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"atcoder\r\n"
						+ "",
						"er\r\n"
						+ ""),
				new Case(true,
						"tourist\r\n"
						+ "",
						"ist\r\n"
						+ ""),
				new Case(true,
						"er\r\n"
						+ "",
						"er\r\n"
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
