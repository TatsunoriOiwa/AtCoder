package oiwa.atcoder.beginner185.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"12\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"13\r\n"
						+ "",
						"12\r\n"
						+ ""),
				new Case(true,
						"17\r\n"
						+ "",
						"4368\r\n"
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
