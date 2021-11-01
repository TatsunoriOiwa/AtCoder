package oiwa.atcoder.beginner225.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 3\r\n"
						+ "ode\r\n"
						+ "zaaa\r\n"
						+ "r\r\n"
						+ "atc\r\n"
						+ "",
						"atcoder\r\n"
						+ ""),
				new Case(true,
						"5 2\r\n"
						+ "z\r\n"
						+ "z\r\n"
						+ "zzz\r\n"
						+ "z\r\n"
						+ "zzzzzz\r\n"
						+ "",
						"zz\r\n"
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
