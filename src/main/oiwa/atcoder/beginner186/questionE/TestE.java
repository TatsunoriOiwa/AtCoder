package oiwa.atcoder.beginner186.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4\r\n"
						+ "10 4 3\r\n"
						+ "1000 11 2\r\n"
						+ "998244353 897581057 595591169\r\n"
						+ "10000 6 14\r\n"
						+ "",
						"2\r\n"
						+ "-1\r\n"
						+ "249561088\r\n"
						+ "3571\r\n"
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
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
