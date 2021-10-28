package oiwa.atcoder.beginner200.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestE {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case(true,
						"2 5\r\n"
						+ "",
						"1 2 2\r\n"
						+ ""),
				new Case(false,
						"1000000 1000000000000000000\r\n"
						+ "",
						"1000000 1000000 1000000\r\n"
						+ ""),
				new Case(true,
						"9 47\r\n"
						+ "",
						"3 1 4\r\n"
						+ ""),
				new Case(true,
						"4 63\r\n"
						+ "",
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
