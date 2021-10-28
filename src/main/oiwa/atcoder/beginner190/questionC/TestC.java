package oiwa.atcoder.beginner190.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

/**
 * ABC 190 C, 12 min.
 * @author T.Oiwa
 *
 */
public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"4 4\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "2 4\r\n"
						+ "3 4\r\n"
						+ "3\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "2 3\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"4 4\r\n"
						+ "1 2\r\n"
						+ "1 3\r\n"
						+ "2 4\r\n"
						+ "3 4\r\n"
						+ "4\r\n"
						+ "3 4\r\n"
						+ "1 2\r\n"
						+ "2 4\r\n"
						+ "2 4\r\n"
						+ "",
						"4\r\n"
						+ ""),
				new Case(true,
						"6 12\r\n"
						+ "2 3\r\n"
						+ "4 6\r\n"
						+ "1 2\r\n"
						+ "4 5\r\n"
						+ "2 6\r\n"
						+ "1 5\r\n"
						+ "4 5\r\n"
						+ "1 3\r\n"
						+ "1 2\r\n"
						+ "2 6\r\n"
						+ "2 3\r\n"
						+ "2 5\r\n"
						+ "5\r\n"
						+ "3 5\r\n"
						+ "1 4\r\n"
						+ "2 6\r\n"
						+ "4 6\r\n"
						+ "5 6\r\n"
						+ "",
						"9\r\n"
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
