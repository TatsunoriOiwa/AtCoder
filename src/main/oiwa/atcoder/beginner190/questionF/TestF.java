package oiwa.atcoder.beginner190.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "0 1 2 3\r\n"
						+ "",
						"0\r\n"
						+ "3\r\n"
						+ "4\r\n"
						+ "3\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "0 3 1 5 4 2 9 6 8 7\r\n"
						+ "",
						"9\r\n"
						+ "18\r\n"
						+ "21\r\n"
						+ "28\r\n"
						+ "27\r\n"
						+ "28\r\n"
						+ "33\r\n"
						+ "24\r\n"
						+ "21\r\n"
						+ "14\r\n"
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
		});
	}
}
