package oiwa.atcoder.beginner201.questionD2;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD2 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3 3\r\n"
						+ "---\r\n"
						+ "+-+\r\n"
						+ "+--\r\n"
						+ "",
						"Takahashi\r\n"
						+ ""),
				new Case(true,
						"2 4\r\n"
						+ "+++-\r\n"
						+ "-+-+\r\n"
						+ "",
						"Aoki\r\n"
						+ ""),
				new Case(true,
						"1 1\r\n"
						+ "-\r\n"
						+ "",
						"Draw\r\n"
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
