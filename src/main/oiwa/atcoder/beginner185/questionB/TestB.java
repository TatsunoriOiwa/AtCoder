package oiwa.atcoder.beginner185.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"10 2 20\r\n"
						+ "9 11\r\n"
						+ "13 17\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"10 2 20\r\n"
						+ "9 11\r\n"
						+ "13 16\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"15 3 30\r\n"
						+ "5 8\r\n"
						+ "15 17\r\n"
						+ "24 27\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"20 1 30\r\n"
						+ "20 29\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"20 1 30\r\n"
						+ "1 10\r\n"
						+ "",
						"No\r\n"
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
