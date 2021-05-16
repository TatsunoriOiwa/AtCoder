package oiwa.atcoder.b_jsc2021.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestF {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case(true,
						"2 2 4\r\n"
						+ "1 1 10\r\n"
						+ "2 1 20\r\n"
						+ "2 2 5\r\n"
						+ "1 1 30\r\n"
						+ "",
						"20\r\n"
						+ "50\r\n"
						+ "55\r\n"
						+ "85\r\n"
						+ ""),
				new Case(true,
						"3 3 5\r\n"
						+ "1 3 10\r\n"
						+ "2 1 7\r\n"
						+ "1 3 5\r\n"
						+ "2 2 10\r\n"
						+ "2 1 1\r\n"
						+ "",
						"30\r\n"
						+ "44\r\n"
						+ "31\r\n"
						+ "56\r\n"
						+ "42\r\n"
						+ ""),
				new Case(true,
						"200000 200000 4\r\n"
						+ "2 112219 100000000\r\n"
						+ "1 73821 100000000\r\n"
						+ "2 26402 100000000\r\n"
						+ "1 73821 100000000\r\n"
						+ "",
						"20000000000000\r\n"
						+ "39999900000000\r\n"
						+ "59999800000000\r\n"
						+ "59999800000000\r\n"
						+ ""),
		});
	}
}
