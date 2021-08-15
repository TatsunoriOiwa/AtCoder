package oiwa.atcoder.beginner214.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "4 1 5\r\n"
						+ "3 10 100\r\n"
						+ "",
						"3\r\n"
						+ "7\r\n"
						+ "8\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "100 100 100 100\r\n"
						+ "1 1 1 1\r\n"
						+ "",
						"1\r\n"
						+ "1\r\n"
						+ "1\r\n"
						+ "1\r\n"
						+ ""),
				new Case(true,
						"4\r\n"
						+ "1 2 3 4\r\n"
						+ "1 2 4 7\r\n"
						+ "",
						"1\r\n"
						+ "2\r\n"
						+ "4\r\n"
						+ "7\r\n"
						+ ""),
				new Case(true,
						"8\r\n"
						+ "84 87 78 16 94 36 87 93\r\n"
						+ "50 22 63 28 91 60 64 27\r\n"
						+ "",
						"50\r\n"
						+ "22\r\n"
						+ "63\r\n"
						+ "28\r\n"
						+ "44\r\n"
						+ "60\r\n"
						+ "64\r\n"
						+ "27\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
