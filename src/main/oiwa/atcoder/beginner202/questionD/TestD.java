package oiwa.atcoder.beginner202.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV2;

public class TestD {
	public static void main(String[] args) {
		new TesterV2(Main.class, new Case[] {
				
				new Case(true,
						"2 2 4\r\n"
						+ "",
						"baab\r\n"
						+ ""),
				new Case(true,
						"30 30 118264581564861424\r\n"
						+ "",
						"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\n"
						+ ""),
				new Case(true,
						"3 1 3",
						"abaa\r\n"),
				new Case(true,
						"1 3 1",
						"abbb\r\n"),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
