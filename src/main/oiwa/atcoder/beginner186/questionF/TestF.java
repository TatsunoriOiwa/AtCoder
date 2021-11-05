package oiwa.atcoder.beginner186.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 3 2\r\n"
						+ "2 2\r\n"
						+ "3 3\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"5 4 4\r\n"
						+ "3 2\r\n"
						+ "3 4\r\n"
						+ "4 2\r\n"
						+ "5 2\r\n"
						+ "",
						"14\r\n"
						+ ""),
				new Case(true,
						"200000 200000 0\r\n"
						+ "",
						"40000000000\r\n"
						+ ""),
				new Case(true,
						"4 3 2 "
						+ "3 1 "
						+ "1 3 ",
						"7"),
				new Case(true,
						"4 3 1\r\n"
						+ "2 2\r\n"
						+ "",
						"11\r\n"
						+ ""),
				new Case(true,
						"4 4 2 "
						+ "2 2 "
						+ "2 4 ",
						"14"),
				new Case(true,
						"4 4 3 "
						+ "2 2 "
						+ "2 4 "
						+ "4 1",
						"11"),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
