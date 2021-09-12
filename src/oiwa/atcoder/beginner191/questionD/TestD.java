package oiwa.atcoder.beginner191.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"0.2 0.8 1.1\r\n"
						+ "",
						"3\r\n"
						+ ""),
				new Case(true,
						"100 100 1\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"42782.4720 31949.0192 99999.99\r\n"
						+ "",
						"31415920098\r\n"
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
