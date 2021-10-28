package oiwa.atcoder.beginner195.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"1010\r\n"
						+ "",
						"11\r\n"
						+ ""),
				new Case(true,
						"27182818284590\r\n"
						+ "",
						"107730272137364\r\n"
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
		});
	}
}
