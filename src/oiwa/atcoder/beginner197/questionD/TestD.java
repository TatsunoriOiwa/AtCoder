package oiwa.atcoder.beginner197.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV2;

public class TestD {
	public static void main(String[] args) {
		new TesterV2(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "1 1\r\n"
						+ "2 2\r\n"
						+ "",
						"2.00000000000 1.00000000000\r\n"
						+ ""),
				new Case(true,
						"6\r\n"
						+ "5 3\r\n"
						+ "7 4\r\n"
						+ "",
						"5.93301270189 2.38397459622\r\n"
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
