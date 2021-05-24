package oiwa.atcoder.beginner197.questionF;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
		out.flush();
	}
	
	
	public void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
		
		final int N = sc.nextInt(); // vertex
		final int M = sc.nextInt(); // edge
		Map<Integer, Set<Edge>> rawoutmap2 = new HashMap<>();
		for (int i = 0; i < N; i++) {
			rawoutmap2.put(i, new HashSet<>());
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			String c = sc.next();
			rawoutmap2.get(a).add(new Edge(c, b));
			rawoutmap2.get(b).add(new Edge(c, a));
		}
		
		Map<BiSet, Set<BiSet>> outmap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				BiSet pos = new BiSet(i, j);
				Set<BiSet> outs = new HashSet<>();
				outmap.put(pos, outs);
				for (Edge ie : rawoutmap2.get(i)) {
					for (Edge je : rawoutmap2.get(j)) {
						if (ie.colour.equals(je.colour)) {
							outs.add(new BiSet(ie.to, je.to));
						}
					}
				}
			}
		}
		
		// BFS
		LinkedList<BfsNode> bfs = new LinkedList<>();
		Set<BiSet> checked = new HashSet<>(N*N);
		{
			BiSet pos = new BiSet(0, N-1);
			bfs.offer(new BfsNode(1, pos));
			checked.add(pos);
		}
		while (!bfs.isEmpty()) {
			BfsNode node = bfs.poll();
			for (BiSet on : outmap.get(node.pos)) {
				int flag = node.pos.swapOrEnd(on);
				if (flag <= 0) {
					out.println(node.depth*2 + flag);
					return;
				}
				if (!checked.contains(on)) {
					checked.add(on);
					bfs.add(new BfsNode(node.depth+1, on));
				}
			}
		}
		out.println(-1);
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
		
		public BiSet(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public int swapOrEnd(BiSet next) {
			if (next.a == next.b) return 0;
			else if (this.a == next.b && this.b == next.a) return -1;
			else return 1;
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
