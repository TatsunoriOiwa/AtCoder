package oiwa.atcoder.beginner231.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 1\r\n"
						+ "100 160 130\r\n"
						+ "120\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ "1 2 3 4 5\r\n"
						+ "6\r\n"
						+ "5\r\n"
						+ "4\r\n"
						+ "3\r\n"
						+ "2\r\n"
						+ "",
						"0\r\n"
						+ "1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ "4\r\n"
						+ ""),
				new Case(true,
						"5 5\r\n"
						+ "804289384 846930887 681692778 714636916 957747794\r\n"
						+ "424238336\r\n"
						+ "719885387\r\n"
						+ "649760493\r\n"
						+ "596516650\r\n"
						+ "189641422\r\n"
						+ "",
						"5\r\n"
						+ "3\r\n"
						+ "5\r\n"
						+ "5\r\n"
						+ "5\r\n"
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
