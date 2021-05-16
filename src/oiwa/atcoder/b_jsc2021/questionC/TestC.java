package oiwa.atcoder.b_jsc2021.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestC {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case(true,
						"2 4\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"199999 200000\r\n"
						+ "",
						"1\r\n"
						+ ""),
				new Case(true,
						"101 139\r\n"
						+ "",
						"34\r\n"
						+ ""),
				new Case(true,
						"1 200000\r\n"
						+ "",
						"34\r\n"
						+ ""),
		});
	}
}
