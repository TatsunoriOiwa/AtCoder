package oiwa.atcoder.beginner198.questionE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] colours = new int[N];
		for (int i = 0; i < N; i++) {
			colours[i] = sc.nextInt();
		}
		Map<Integer, Set<Integer>> outs = new HashMap<>();
		for (int i = 0; i < N-2; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (!outs.containsKey(a)) outs.put(a, new HashSet<>());
			if (!outs.containsKey(b)) outs.put(b, new HashSet<>());
			outs.get(a).add(b);
			outs.get(b).add(a);
		}
		Map<Integer, Set<Integer>> colourOnPath = new HashMap<>();
		colourOnPath.put(0, new HashSet<>(colours[0]));
		Set<Integer> reached = new HashSet<>();
		reached.add(0);
		List<Integer> result = new LinkedList<>();
		while (!colourOnPath.isEmpty()) {
			Map<Integer, Set<Integer>> next = new HashMap<>();
			for (Entry<Integer, Set<Integer>> e : colourOnPath.entrySet()) {
				int v = e.getKey();
				Set<Integer> traversedColours = e.getValue();
//				System.out.print(v + ":");
//				this.printSet(traversedColours);
				for (int nv : outs.get(v)) {
					int nc = colours[nv];
					if (!reached.contains(nv)) {
						reached.add(nv);
						Set<Integer> ncs = new HashSet<>(traversedColours);
						ncs.add(nc);
						next.put(nv, ncs);
						if (!traversedColours.contains(nc)) {
							result.add(nv);
//							System.out.println(" -> " + nv + " " + nc);
						}
					}
				}
			}
			colourOnPath = next;
		}
		Integer[] res = result.toArray(new Integer[result.size()]);
		Arrays.sort(res);
		for (int i : res) {
			System.out.println(i+1);
		}
	}
//	
//	private void printSet(Set<Integer> set) {
//		for (int i : set) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//	}
}
