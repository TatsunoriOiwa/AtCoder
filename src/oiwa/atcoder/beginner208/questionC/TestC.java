package oiwa.atcoder.beginner208.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2 7\r\n"
						+ "1 8\r\n"
						+ "",
						"4\r\n"
						+ "3\r\n"
						+ ""),
				new Case(true,
						"1 3\r\n"
						+ "33\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"7 1000000000000\r\n"
						+ "99 8 2 4 43 5 3\r\n"
						+ "",
						"142857142857\r\n"
						+ "142857142857\r\n"
						+ "142857142858\r\n"
						+ "142857142857\r\n"
						+ "142857142857\r\n"
						+ "142857142857\r\n"
						+ "142857142857\r\n"
						+ ""),
				new Case(true,
						"3 9\r\n" + 
						"1 2 3",
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
