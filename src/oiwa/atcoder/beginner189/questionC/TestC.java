package oiwa.atcoder.beginner189.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"6\r\n"
						+ "2 4 4 9 4 9\r\n"
						+ "",
						"20\r\n"
						+ ""),
				new Case(true,
						"6\r\n"
						+ "200 4 4 9 4 9\r\n"
						+ "",
						"200\r\n"
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
