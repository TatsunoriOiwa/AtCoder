package oiwa.atcoder.beginner192.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"314 2\r\n"
						+ "",
						"693\r\n"
						+ ""),
				new Case(true,
						"1000000000 100\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"6174 100000\r\n"
						+ "",
						"6174\r\n"
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
