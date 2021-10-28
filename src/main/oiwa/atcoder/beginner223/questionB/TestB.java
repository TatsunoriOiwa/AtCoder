package oiwa.atcoder.beginner223.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestB {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"aaba\r\n"
						+ "",
						"aaab\r\n"
						+ "baaa\r\n"
						+ ""),
				new Case(true,
						"z\r\n"
						+ "",
						"z\r\n"
						+ "z\r\n"
						+ ""),
				new Case(true,
						"abracadabra\r\n"
						+ "",
						"aabracadabr\r\n"
						+ "racadabraab\r\n"
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
