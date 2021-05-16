package oiwa.atcoder.b_jsc2021.questionC;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
//		String s = sc.next();	
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		int gcd = 1;
		
//		for (int y = B; y > gcd && y > A; y--) {
//			for (int x = Math.min(y-1, A*2); x > gcd && x >= A; x--) {
//				gcd = Math.max(gcd, this.gcd(y, x));
//			}
//		}
		
		for (int x = B-1; x > gcd && x >= A; x--) {
			for (int y = Math.min(x*2, B); y > gcd && y > x; y--) {
				gcd = Math.max(gcd, this.gcd(y, x));
			}
		}
		
		System.out.println(gcd);
	}
	
	/**
	 * x の方が大きいようにする
	 * @param a
	 * @param b
	 * @return
	 */
	private int gcd(int a, int b) {
		int r = 1; // any non-zero integer.
		while(r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
