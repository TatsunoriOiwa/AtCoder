package oiwa.atcoder.util.test;

import java.util.Random;

import oiwa.atcoder.util.template.Main;

public class ClassTestAtMath {

	public static void main(String[] args) {
		testCase(5, 7);
		testCase(6, 0);
		testCase(13, 17);
		
		speedTest();
		speedTest();
		speedTest();
		speedTest();
		speedTest();
		speedTest();
	}
	
	public static void testCase(long x, int n) {
		double math = Math.pow(x, n);
		long atma = Main.AtMath.power(x, n);
		System.out.println(math + " " + atma + " " + (math == atma));
	}
	
	public static void speedTest() {
		Random rand = new Random();
		long x = rand.nextLong() / 2 + Long.MAX_VALUE / 2;
		int n = rand.nextInt() / 2 + Integer.MAX_VALUE/2;
		int rep = 1_000_000_00;
		
		long time;
		time = System.currentTimeMillis();
		for (int i = 0; i < rep; i++) { powertypeA(x, n, Long.MAX_VALUE); }
		long timeA = System.currentTimeMillis() - time;
		
		time = System.currentTimeMillis();
		for (int i = 0; i < rep; i++) { powertypeB(x, n, Long.MAX_VALUE); }
		long timeB = System.currentTimeMillis() - time;
		
		System.out.println("Case: x=" + x + ",\tn=" + n
				+ ",\teq=" + (powertypeA(x, n, Long.MAX_VALUE) == powertypeB(x, n, Long.MAX_VALUE))
				+ ",\tA:" + timeA + ",\tB:" + timeB);
	}
	
	public static long powertypeA(long x, int n, long mod) {
		assert(n >= 0);
		if (n == 0) return 1;
		if (n == 1) return x;
		x %= mod;
		long res = 1;

		long mul = x;
		for (int mask = 1, i = 0; (mask < n && i < 32); mask <<= 1, i++) { // JITコンパイルか何かの影響で最初の何回かが妙に遅くなる
			if ((mask & n) != 0) { 
				res *= mul;
				res %= mod;
			}
//			if (!(mask < n && i < 32)) break;
			mul *= mul;
			mul %= mod;
		}
		return res;
	}
	
	public static long powertypeB(long x, int n, long mod) {
		assert(n >= 0);
		if (n == 0) return 1;
		if (n == 1) return x;
		x %= mod;
		long res = 1;
		for (int i = 31; i >= 0; i--) { // 31: number of bits of integer.
		res *= res;
		res %= mod;
		if ((n & (1<<i)) != 0) {
			res *= x;
			res %= mod;
		}
	}
		return res;
	}
}
