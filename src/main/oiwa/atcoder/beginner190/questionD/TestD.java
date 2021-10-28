package oiwa.atcoder.beginner190.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

/**
 * ABC 190 D, failed
 * @author T.Oiwa
 *
 */
public class TestD {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"12\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"1\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"963761198400\r\n"
						+ "",
						"1920\r\n"
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
