package oiwa.atcoder.beginner197.questionF2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
		out.flush();
	}
	
	
	public void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
		
//		long nanos = System.nanoTime();
		final int N = sc.nextInt(); // vertex
		final int M = sc.nextInt(); // edge
		@SuppressWarnings("unchecked")
		Map<String, List<Integer>>[] rawoutmap4 = new HashMap[N];
//		@SuppressWarnings("unchecked")
//		Set<Edge>[] rawoutmap3 = new HashSet[N];
//		Map<Integer, Set<Edge>> rawoutmap2 = new HashMap<>();
//		for (int i = 0; i < N; i++) {
////			rawoutmap2.put(i, new HashSet<>());
//			rawoutmap3[i] = new HashSet<>();
//		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			String c = sc.next();
//			rawoutmap2.get(a).add(new Edge(c, b));
//			rawoutmap2.get(b).add(new Edge(c, a));
//			rawoutmap3[a].add(new Edge(c, b));
//			rawoutmap3[b].add(new Edge(c, a));
			Map<String, List<Integer>> mapa = rawoutmap4[a] == null ? rawoutmap4[a] = new HashMap<>() : rawoutmap4[a];
			Map<String, List<Integer>> mapb = rawoutmap4[b] == null ? rawoutmap4[b] = new HashMap<>() : rawoutmap4[b];
			if (!mapa.containsKey(c)) mapa.put(c, new LinkedList<>());
			if (!mapb.containsKey(c)) mapb.put(c, new LinkedList<>());
			mapa.get(c).add(b);
			mapb.get(c).add(a);
		}
//		System.out.println(System.nanoTime() - nanos);
//		nanos = System.nanoTime();
		// BFS
		PriorityQueue<BfsNode> bfs = new PriorityQueue<>((a,b) -> Integer.compare(a.depth, b.depth));
		Set<BiSet> checked = new HashSet<>(N*N);
		{
			BiSet pos = BiSet.parse(0, N-1);
			bfs.add(new BfsNode(0, pos));
			checked.add(pos);
		}
		while (!bfs.isEmpty()) {
			BfsNode node = bfs.poll();
			if (node.pos == null) {
				out.println(node.depth);
				return;
			}
			for (String ci : rawoutmap4[node.pos.a].keySet()) {
				Map<String, List<Integer>> mapj = rawoutmap4[node.pos.b];
				if (!mapj.containsKey(ci)) continue;
				for (int ni : rawoutmap4[node.pos.a].get(ci)) {
					for (int nj : mapj.get(ci)) {
						BiSet on = new BiSet(ni, nj);
						if (checked.contains(on)) continue;
						checked.add(on);
						if (on.a == on.b) {
							bfs.offer(new BfsNode(node.depth+2, null));
						} else if (node.pos.a == on.b && node.pos.b == on.a) {
							bfs.offer(new BfsNode(node.depth+1, null));
						} else  {
							bfs.offer(new BfsNode(node.depth+2, on));
						}
					}
				}
			}
		}
		out.println(-1);
//		System.out.println(System.nanoTime() - nanos);
	}
	
	public static class Edge {
		public final String colour;
		public final int to;
		public Edge(String colour, int to) {
			super();
			this.colour = colour;
			this.to = to;
		}
		
		
	}
	
	public static class BfsNode {
		public final int depth;
		public final BiSet pos;
		
		public BfsNode(int depth, BiSet pos) {
			this.depth = depth;
			this.pos = pos;
		}
	}
	
	public void addToSet(Map<String, Set<Integer>> outset, String c, int v) {
		Set<Integer> set;
		if (outset.containsKey(c)) { set = outset.get(c); }
		else { outset.put(c, set = new HashSet<>()); }
		set.add(v);
	}
	
	public static class BiSet {
		public final int a;
		public final int b;
		
//		public static BiSet[][] cache;
		
		public BiSet(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public static BiSet parse(int a, int b) {
			return new BiSet(a, b);
//			if (cache[a][b] != null) return cache[a][b];
//			else return cache[a][b] = new BiSet(a, b);
		}
		
		@Override
		public int hashCode() {
			return Integer.hashCode(a) * 17 + Integer.hashCode(b);
		}
		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof BiSet)) return false;
			BiSet other = (BiSet) obj;
			return this.a == other.a && this.b == other.b;
		}
		
		@Override
		public String toString() {
			return "(" + this.a + "," + this.b + ")";
		}
	}
	
	
	// ==== Fast Util ====
	
	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) { return true; }
			else {
				ptr = 0;
				try { buflen = in.read(buffer); }
				catch (IOException e) { e.printStackTrace(); }
				if (buflen <= 0) { return false; }
			}
			return true;
		}
		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}
		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}
		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) { throw new NumberFormatException(); }
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}
		public double nextDouble() { return Double.parseDouble(next()); }
		public int[] nextIntArray(final int N) {
			int[] ret = new int[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextInt(); }
			return ret;
		}
		public long[] nextLongArray(final int N) {
			long[] ret = new long[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextLong(); }
			return ret;
		}
	}
}
