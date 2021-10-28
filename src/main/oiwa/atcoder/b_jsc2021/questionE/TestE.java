package oiwa.atcoder.b_jsc2021.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestE {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case(true,
						"4\r\n"
						+ "aabaaaabaa\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "aabaaaabaa\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "aabaaaabaa\r\n"
						+ "",
						"impossible\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "aabaaaabaa\r\n"
						+ "",
						"impossible\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "acaabcbababaaac\r\n"
						+ "",
						"6\r\n"
						+ ""),
				new Case(false,
						"",
						""),
		});
	}
}
