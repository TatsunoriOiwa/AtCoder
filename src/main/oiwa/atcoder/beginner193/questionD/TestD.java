package oiwa.atcoder.beginner193.questionD;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestD {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"2\r\n"
						+ "1144#\r\n"
						+ "2233#\r\n"
						+ "",
						"0.4444444444444444\r\n"
						+ ""),
				new Case(true,
						"2\r\n"
						+ "9988#\r\n"
						+ "1122#\r\n"
						+ "",
						"1.0\r\n"
						+ ""),
				new Case(true,
						"6\r\n"
						+ "1122#\r\n"
						+ "2228#\r\n"
						+ "",
						"0.001932367149758454\r\n"
						+ ""),
				new Case(true,
						"100000\r\n"
						+ "3226#\r\n"
						+ "3597#\r\n"
						+ "",
						"0.6296297942426154\r\n"
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
