package oiwa.atcoder.beginner198.questionD;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	private String str1;
	private String str2;
	private String str3;
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		solve(str1, str2, str3);
	}
	
	private void solve(String str1, String str2, String str3) {
		Set<Integer> charset = new HashSet<>();
		str1.chars().forEach(i -> charset.add(i));
		str2.chars().forEach(i -> charset.add(i));
		str3.chars().forEach(i -> charset.add(i));
		int[] keys = new int[charset.size()];
		{
			int i = 0;
			for (int c : charset) {
				keys[i] = c;
				i++;
			}
		}
		Arrays.sort(keys);
		Map<Integer, Integer> c2i = new HashMap<>();
		if (!this.dfs(c2i, keys, 0)) {
			System.out.println("UNSOLVABLE");
		}
	}
	
	private boolean dfs(Map<Integer, Integer> c2i, int[] keys, int index) {
		if (index < keys.length-1) {
			for (int i = 0; i < 10; i++) {
				c2i.put(keys[index], i);
				if (this.dfs(c2i, keys, index+1)) {
					return true;
				}
			}
		} else {
			for (int i = 0; i < 10; i++) {
				c2i.put(keys[index], i);
				if (this.test(c2i)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean test(Map<Integer, Integer> c2i) {
		int n1 = toNumber(str1, c2i);
		int n2 = toNumber(str2, c2i);
		int n3 = toNumber(str3, c2i);
		if (n1 + n2 == n3) { 
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			return true;
		}
		else { return false; }
	}
	
	private int toNumber(String s, Map<Integer, Integer> c2i) {
		int r = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			int c = s.charAt(i);
			r += 10;
			r += c2i.get(c);
		}
		return r;
	}
}
