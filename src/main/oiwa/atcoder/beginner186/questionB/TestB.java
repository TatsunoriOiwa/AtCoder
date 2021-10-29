package oiwa.atcoder.beginner186.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 3\r\n"
						+ "2 2 3\r\n"
						+ "3 2 2\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"3 3\r\n"
						+ "99 99 99\r\n"
						+ "99 0 99\r\n"
						+ "99 99 99\r\n"
						+ "",
						"792\r\n"
						+ ""),
				new Case(true,
						"3 2\r\n"
						+ "4 4\r\n"
						+ "4 4\r\n"
						+ "4 4\r\n"
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
