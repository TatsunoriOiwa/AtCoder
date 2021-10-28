package oiwa.atcoder.beginner193.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestA {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"100 80\r\n"
						+ "",
						"20.0\r\n"
						+ ""),
				new Case(true,
						"7 6\r\n"
						+ "",
						"14.285714285714285714\r\n"
						+ ""),
				new Case(true,
						"99999 99998\r\n"
						+ "",
						"0.00100001000010000100\r\n"
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
