package oiwa.atcoder.beginner193.questionB;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestB {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "3 9 5\r\n"
						+ "4 8 5\r\n"
						+ "5 7 5\r\n"
						+ "",
						"8\r\n"
						+ ""),
				new Case(true,
						"3\r\n"
						+ "5 9 5\r\n"
						+ "6 8 5\r\n"
						+ "7 7 5\r\n"
						+ "",
						"-1\r\n"
						+ ""),
				new Case(true,
						"10\r\n"
						+ "158260522 877914575 602436426\r\n"
						+ "24979445 861648772 623690081\r\n"
						+ "433933447 476190629 262703497\r\n"
						+ "211047202 971407775 628894325\r\n"
						+ "731963982 822804784 450968417\r\n"
						+ "430302156 982631932 161735902\r\n"
						+ "880895728 923078537 707723857\r\n"
						+ "189330739 910286918 802329211\r\n"
						+ "404539679 303238506 317063340\r\n"
						+ "492686568 773361868 125660016\r\n"
						+ "",
						"861648772\r\n"
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
