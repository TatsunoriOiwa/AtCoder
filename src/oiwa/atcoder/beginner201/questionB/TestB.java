package oiwa.atcoder.beginner201.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.Tester;

public class TestB {
	public static void main(String[] args) {
		new Tester(Main::main, new Case[] {
				new Case(true,
						"3\r\n"
						+ "Everest 8849\r\n"
						+ "K2 8611\r\n"
						+ "Kangchenjunga 8586\r\n"
						+ "",
						"K2\r\n"
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
		});
	}
}
