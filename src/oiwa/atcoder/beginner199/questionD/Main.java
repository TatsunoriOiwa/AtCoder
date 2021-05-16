package oiwa.atcoder.beginner199.questionD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final int V = sc.nextInt();
		final int E = sc.nextInt();
		Map<Integer, List<Integer>> outmap = new HashMap<>();
		TreeSet<Integer> unsearched = new TreeSet<>();
		for (int i = 0; i < V; i++) {
			outmap.put(i, new LinkedList<>());
			unsearched.add(i);
		}
		for (int i = 0; i < E; i++) { // 出エッジの登録
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			outmap.get(a).add(b);
			outmap.get(b).add(a);
		}
		
		long finalResult = 1;
		while (!unsearched.isEmpty()) {
			int start = unsearched.pollFirst();
			
			List<Integer> subgraph = new ArrayList<>();
			this.recursiveDFS(outmap, subgraph, unsearched, start); // 連結な部分グラフを取得する
			
			int count = 0;
			Map<Integer, Integer> colourMap = new HashMap<>();
			
			colourMap.put(start, 0);
			int indx = 0;
			while (indx >= 0) {
				if (indx >= subgraph.size()) {
					count++;
					indx--;
					continue;
				}
				int node = subgraph.get(indx);
				int colour = colourMap.containsKey(node) ? colourMap.get(node)+1 : 0;
				for (; colour < 3; colour++) {
					if (this.colourOK(outmap, colourMap, node, colour)) {
						colourMap.put(node, colour);
						indx++;
						break;
					}
				}
				if (colour >= 3) {
					indx--;
					colourMap.remove(node);
					continue;
				}
			}
			
			if (count == 0) {
				System.out.println(0);
				return;
			}
			finalResult *= count * 3;
		}
		
		System.out.println(finalResult);
	}
	
	private void recursiveDFS(Map<Integer, List<Integer>> outmap, List<Integer> list, Set<Integer> unsearched, int now) {
		for (int out : outmap.get(now)) {
			if (unsearched.contains(out)) {
				list.add(out);
				unsearched.remove(out);
				this.recursiveDFS(outmap, list, unsearched, out);
			}
		}
	}
	
	private boolean colourOK(Map<Integer, List<Integer>> outmap, Map<Integer, Integer> colourMap, int pos, int colour) {
		for (int naighbour : outmap.get(pos)) {
			if (colourMap.containsKey(naighbour) && colourMap.get(naighbour) == colour) {
				return false;
			}
		}
		return true;
	}
}
