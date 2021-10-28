package oiwa.atcoder.beginner207.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV3;

public class TestC {
	public static void main(String[] args) {
		new TesterV3(Main.class, new Case[] {
				
				new Case(true,
						"3\r\n"
						+ "1 1 2\r\n"
						+ "2 2 3\r\n"
						+ "3 2 4\r\n"
						+ "",
						"2\r\n"
						+ ""),
				new Case(true,
						"19\r\n"
						+ "4 210068409 221208102\r\n"
						+ "4 16698200 910945203\r\n"
						+ "4 76268400 259148323\r\n"
						+ "4 370943597 566244098\r\n"
						+ "1 428897569 509621647\r\n"
						+ "4 250946752 823720939\r\n"
						+ "1 642505376 868415584\r\n"
						+ "2 619091266 868230936\r\n"
						+ "2 306543999 654038915\r\n"
						+ "4 486033777 715789416\r\n"
						+ "1 527225177 583184546\r\n"
						+ "2 885292456 900938599\r\n"
						+ "3 264004185 486613484\r\n"
						+ "2 345310564 818091848\r\n"
						+ "1 152544274 521564293\r\n"
						+ "4 13819154 555218434\r\n"
						+ "3 507364086 545932412\r\n"
						+ "4 797872271 935850549\r\n"
						+ "2 415488246 685203817\r\n"
						+ "",
						"102\r\n"
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
		});
	}
}
