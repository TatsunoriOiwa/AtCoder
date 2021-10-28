package oiwa.atcoder.beginner192.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"dIfFiCuLt\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"eASY\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"a\r\n"
						+ "",
						"Yes\r\n"
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
