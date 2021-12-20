package oiwa.atcoder.beginner231.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5\r\n"
						+ "snuke\r\n"
						+ "snuke\r\n"
						+ "takahashi\r\n"
						+ "takahashi\r\n"
						+ "takahashi\r\n"
						+ "",
						"takahashi\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "takahashi\r\n"
						+ "takahashi\r\n"
						+ "aoki\r\n"
						+ "takahashi\r\n"
						+ "snuke\r\n"
						+ "",
						"takahashi\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "a\r\n"
						+ "",
						"a\r\n"
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
