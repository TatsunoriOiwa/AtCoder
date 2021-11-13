package oiwa.atcoder.beginner227.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"100\r\n"
						+ "",
						"323\r\n"
						+ ""),
				new Case(true,
						"100000000000\r\n"
						+ "",
						"5745290566750\r\n"
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
