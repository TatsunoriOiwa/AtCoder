package oiwa.atcoder.beginner199.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterOld;

public class TestC {
	public static void main(String[] args) {
		new TesterOld(Main::main, new Case[] {
				new Case(true,
						"2\r\n"
						+ "FLIP\r\n"
						+ "2\r\n"
						+ "2 0 0\r\n"
						+ "1 1 4\r\n"
						+ "",
						"LPFI\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "FLIP\r\n"
						+ "6\r\n"
						+ "1 1 3\r\n"
						+ "2 0 0\r\n"
						+ "1 1 2\r\n"
						+ "1 2 3\r\n"
						+ "2 0 0\r\n"
						+ "1 1 4\r\n"
						+ "",
						"ILPF\r\n"
						+ ""),
				new Case(false,
						"",
						""),
		});
	}
}
