package oiwa.atcoder.beginner223.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"5 3\r\n"
						+ "(())(\r\n"
						+ "2 1 4\r\n"
						+ "2 1 2\r\n"
						+ "2 4 5\r\n"
						+ "",
						"Yes\r\n"
						+ "No\r\n"
						+ "No\r\n"
						+ ""),
				new Case(true,
						"5 3\r\n"
						+ "(())(\r\n"
						+ "2 1 4\r\n"
						+ "1 1 4\r\n"
						+ "2 1 4\r\n"
						+ "",
						"Yes\r\n"
						+ "No\r\n"
						+ ""),
				new Case(true,
						"8 8\r\n"
						+ "(()(()))\r\n"
						+ "2 2 7\r\n"
						+ "2 2 8\r\n"
						+ "1 2 5\r\n"
						+ "2 3 4\r\n"
						+ "1 3 4\r\n"
						+ "1 3 5\r\n"
						+ "1 1 4\r\n"
						+ "1 6 8\r\n"
						+ "",
						"Yes\r\n"
						+ "No\r\n"
						+ "No\r\n"
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
