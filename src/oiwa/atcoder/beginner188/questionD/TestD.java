package oiwa.atcoder.beginner188.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 6\r\n"
						+ "1 2 4\r\n"
						+ "2 2 4\r\n"
						+ "",
						"10\r\n"
						+ ""),
				new Case(true,
						"2 100\n"
						+ "1 1 2\n"
						+ "2 2 3",
						"5"),
				new Case(true,
						"5 1000000000\r\n"
						+ "583563238 820642330 44577\r\n"
						+ "136809000 653199778 90962\r\n"
						+ "54601291 785892285 50554\r\n"
						+ "5797762 453599267 65697\r\n"
						+ "468677897 916692569 87409\r\n"
						+ "",
						"163089627821228\r\n"
						+ ""),
				new Case(true,
						"5 100000\r\n"
						+ "583563238 820642330 44577\r\n"
						+ "136809000 653199778 90962\r\n"
						+ "54601291 785892285 50554\r\n"
						+ "5797762 453599267 65697\r\n"
						+ "468677897 916692569 87409\r\n"
						+ "",
						"88206004785464\r\n"
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
