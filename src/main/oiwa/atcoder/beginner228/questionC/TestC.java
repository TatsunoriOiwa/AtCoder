package oiwa.atcoder.beginner228.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 1\r\n"
						+ "178 205 132\r\n"
						+ "112 220 96\r\n"
						+ "36 64 20\r\n"
						+ "",
						"Yes\r\n"
						+ "Yes\r\n"
						+ "No\r\n"
						+ ""),
				new Case(true,
						"2 1\r\n"
						+ "300 300 300\r\n"
						+ "200 200 200\r\n"
						+ "",
						"Yes\r\n"
						+ "Yes\r\n"
						+ ""),
				new Case(true,
						"4 2\r\n"
						+ "127 235 78\r\n"
						+ "192 134 298\r\n"
						+ "28 56 42\r\n"
						+ "96 120 250\r\n"
						+ "",
						"Yes\r\n"
						+ "Yes\r\n"
						+ "No\r\n"
						+ "Yes\r\n"
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
