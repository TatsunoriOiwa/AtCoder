package oiwa.atcoder.beginner201.questionE3;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestE3 {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 2 1\r\n"
						+ "1 3 3\r\n"
						+ "",
						"6\r\n"
						+ ""),
				new Case(true,
						"5\r\n"
						+ "3 5 2\r\n"
						+ "2 3 2\r\n"
						+ "1 5 1\r\n"
						+ "4 5 13\r\n"
						+ "",
						"62\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "5 7 459221860242673109\r\n"
						+ "6 8 248001948488076933\r\n"
						+ "3 5 371922579800289138\r\n"
						+ "2 5 773108338386747788\r\n"
						+ "6 10 181747352791505823\r\n"
						+ "1 3 803225386673329326\r\n"
						+ "7 8 139939802736535485\r\n"
						+ "9 10 657980865814127926\r\n"
						+ "2 4 146378247587539124\r\n"
						+ "",
						"241240228\r\n"
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
