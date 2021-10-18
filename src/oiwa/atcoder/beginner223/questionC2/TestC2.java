package oiwa.atcoder.beginner223.questionC2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 1\r\n"
						+ "2 1\r\n"
						+ "3 1\r\n"
						+ "",
						"3.000000000000000\r\n"
						+ "", 0.00001),
				new Case(true,
						"3\r\n"
						+ "1 3\r\n"
						+ "2 2\r\n"
						+ "3 1\r\n"
						+ "",
						"3.833333333333333\r\n"
						+ "", 0.00001),
				new Case(true,
						"5\r\n"
						+ "3 9\r\n"
						+ "1 2\r\n"
						+ "4 6\r\n"
						+ "1 5\r\n"
						+ "5 3\r\n"
						+ "",
						"8.916666666666668\r\n"
						+ "", 0.00001),
				new Case(false,
						"0",
						"0", 0.00001),
				new Case(false,
						"0",
						"0", 0.00001),
				new Case(false,
						"0",
						"0", 0.00001),
		});
	}
}
