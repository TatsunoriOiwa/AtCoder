package oiwa.atcoder.beginner198.questionC;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		long R = sc.nextInt();
		long X = sc.nextInt();
		long Y = sc.nextInt();
		long i = 1;
		for (; X*X + Y*Y > R*R*i*i; i++) {}
		System.out.println(i);
	}
}
