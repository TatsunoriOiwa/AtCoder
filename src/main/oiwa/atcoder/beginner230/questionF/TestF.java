package oiwa.atcoder.beginner230.questionF;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestF {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 200_000; i++) sb.append(" " + i);
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"200000" + sb),
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
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
