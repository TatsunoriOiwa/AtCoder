package oiwa.atcoder.b_zone2021.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestA {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case(true,
						"abcdZONefghi\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"ZONeZONeZONe\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"helloAtZoner\r\n"
						+ "",
						"0\r\n"
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
