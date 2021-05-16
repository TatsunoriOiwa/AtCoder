package oiwa.atcoder.beginner198.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestC {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case("5 15 0\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case("5 11 0\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case("3 4 4\r\n"
						+ "",
						"2\r\n"
						+ ""),
		});
	}
}
