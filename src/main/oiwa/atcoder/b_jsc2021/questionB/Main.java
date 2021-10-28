package oiwa.atcoder.b_jsc2021.questionB;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
//		String s = sc.next();
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer> aset = new HashSet<>();
		Set<Integer> bset = new HashSet<>();
		for (int i = 0; i < N; i++) {
			aset.add(sc.nextInt());
		}
		for (int i = 0; i < M; i++) {
			bset.add(sc.nextInt());
		}
		
//		System.out.println(s.substring(1) + s.substring(0, 1));
	}
}
