package oiwa.atcoder.b_jsc2021.questionA;

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
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int yz = Y*Z;
		int ans = yz / X;
		if (yz % X == 0) {
			ans--;
		}
		
		System.out.println(ans);
	}
}
