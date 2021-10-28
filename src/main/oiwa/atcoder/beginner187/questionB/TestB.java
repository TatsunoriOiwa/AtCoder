package oiwa.atcoder.beginner187.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "0 0\r\n"
						+ "1 2\r\n"
						+ "2 1\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "-691 273\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "-31 -35\r\n"
						+ "8 -36\r\n"
						+ "22 64\r\n"
						+ "5 73\r\n"
						+ "-14 8\r\n"
						+ "18 -58\r\n"
						+ "-41 -85\r\n"
						+ "1 -88\r\n"
						+ "-21 -85\r\n"
						+ "-11 82\r\n"
						+ "",
						"11\r\n"
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
