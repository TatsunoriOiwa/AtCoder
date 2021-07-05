package oiwa.atcoder.beginner208.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestB {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"9\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"119\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"10000000\r\n"
						+ "",
						"24\r\n"
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
