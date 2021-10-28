package oiwa.atcoder.beginner198.questionA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		String s = sc.next();
		System.out.println(s.substring(1) + s.substring(0, 1));
	}
}
