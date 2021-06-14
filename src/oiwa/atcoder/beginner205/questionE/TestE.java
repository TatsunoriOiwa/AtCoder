package oiwa.atcoder.beginner205.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestE {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2 3 1\r\n"
						+ "",
						"9\r\n"
						+ ""),
				new Case(true,
						"1 0 0\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"1000000 1000000 1000000\r\n"
						+ "",
						"192151600\r\n"
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
		});
	}
}
