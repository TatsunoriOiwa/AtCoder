package oiwa.atcoder.beginner206.questionA;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestA {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"180\r\n"
						+ "",
						"Yay!\r\n"
						+ ""),
				new Case(true,
						"200\r\n"
						+ "",
						":(\r\n"
						+ ""),
				new Case(true,
						"191\r\n"
						+ "",
						"so-so\r\n"
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
