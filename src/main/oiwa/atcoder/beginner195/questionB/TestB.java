package oiwa.atcoder.beginner195.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestB {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"100 200 2\r\n"
						+ "",
						"10 20\r\n"
						+ ""),
				new Case(true,
						"120 150 2\r\n"
						+ "",
						"14 16\r\n"
						+ ""),
				new Case(true,
						"300 333 1\r\n"
						+ "",
						"UNSATISFIABLE\r\n"
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
