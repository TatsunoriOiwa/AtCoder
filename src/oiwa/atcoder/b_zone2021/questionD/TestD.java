package oiwa.atcoder.b_zone2021.questionD;

import java.io.PrintStream;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.PrintStreamPeeker;
import oiwa.atcoder.util.Tester;

public class TestD {
	public static void main(String[] args) {
		System.out.println('\0');
		PrintStream ps = new PrintStreamPeeker(System.out);
		char[] c = new char[6];
		c[0] = 't';
		c[1] = 'e';
		c[2] = 's';
		c[3] = 't';
		c[5] = '!';
		ps.println(c);
		System.out.println(c);
		c[4] = '\0';
		ps.println(c);
		System.out.println(c);
		boolean flag = false;
		flag ^= true;
		flag = !flag;
		System.out.print(flag);
		
		new Tester(Main::main, new Case[] {
				new Case(true,
						"ozRnonnoe\r\n"
						+ "",
						"zone\r\n"
						+ ""),
				new Case(true,
						"hellospaceRhellospace\r\n"
						+ "",
						"\r\n"),
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
