package oiwa.atcoder.beginner230.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestA {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"42\r\n"
						+ "",
						"AGC043\r\n"
						+ ""),
				new Case(true,
						"19\r\n"
						+ "",
						"AGC019\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "",
						"AGC001\r\n"
						+ ""),
				new Case(true,
						"50\r\n"
						+ "",
						"AGC051\r\n"
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
