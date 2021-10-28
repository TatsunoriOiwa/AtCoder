package oiwa.atcoder.beginner196.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestB {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"5.90\r\n"
						+ "",
						"5\r\n"
						+ ""),
				new Case(true,
						"0\r\n"
						+ "",
						"0\r\n"
						+ ""),
				new Case(true,
						"84939825309432908832902189.9092309409809091329\r\n"
						+ "",
						"84939825309432908832902189\r\n"
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
