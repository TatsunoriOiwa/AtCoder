package oiwa.atcoder.beginner229.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"XX...X.X.X.\r\n"
						+ "2\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"XXXX\r\n"
						+ "200000\r\n"
						+ "",
						"4\r\n"
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
