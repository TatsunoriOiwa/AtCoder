package oiwa.atcoder.beginner190.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 9 9\r\n"
						+ "5 5\r\n"
						+ "15 5\r\n"
						+ "5 15\r\n"
						+ "15 15\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"3 691 273\r\n"
						+ "691 997\r\n"
						+ "593 273\r\n"
						+ "691 273\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"7 100 100\r\n"
						+ "10 11\r\n"
						+ "12 67\r\n"
						+ "192 79\r\n"
						+ "154 197\r\n"
						+ "142 158\r\n"
						+ "20 25\r\n"
						+ "17 108\r\n"
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
