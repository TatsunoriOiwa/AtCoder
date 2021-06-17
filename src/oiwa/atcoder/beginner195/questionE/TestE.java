package oiwa.atcoder.beginner195.questionE;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestE {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2\r\n"
						+ "35\r\n"
						+ "AT\r\n"
						+ "",
						"Takahashi\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "12345\r\n"
						+ "AAAAT\r\n"
						+ "",
						"Aoki\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "67890\r\n"
						+ "TTTTA\r\n"
						+ "",
						"Takahashi\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "12345\r\n"
						+ "ATATA\r\n"
						+ "",
						"Aoki\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
