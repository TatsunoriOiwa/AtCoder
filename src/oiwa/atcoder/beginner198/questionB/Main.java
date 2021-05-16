package oiwa.atcoder.beginner198.questionB;

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
		int l = 0;
		int r = s.length()-1;
		while (0 < r) {
			if (s.charAt(r) == '0') {
				r--;
			} else {
				break;
			}
		}
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				System.out.println("No");
				return;
			}
			l++;
			r--;
		}
		System.out.println("Yes");
	}
}
