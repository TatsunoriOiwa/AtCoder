package oiwa.atcoder.beginner208.questionD;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class Main {
	public static boolean DEBUG = false;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
		out.flush();
	}
	
	
	public void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
//		int i = sc.nextInt();
//		String s = sc.next();
//		out.println(sc.next());
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Set<Edge>> outmap = new HashMap<>();
		Map<Integer, Set<Edge>> inmap = new HashMap<>();
		for (int v = 0; v < N; v++) {
			outmap.put(v, new HashSet<>());
			inmap.put(v, new HashSet<>());
		}
		// long[B][A] B番目の都市へ，Aから，番号がs, t, -1以下の都市を通って移動するのにかかる最短時間
		long[][] shortest = new long[N][N];
		long baseSum = 0;
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			int C = sc.nextInt();
			Edge edge = new Edge(A, B, C);
			outmap.get(A).add(edge);
			inmap.get(B).add(edge);
			shortest[B][A] = C;
			baseSum += C;
		}
		long sum = 0;
		for (int k = 0; k < N; k++) {
			// process in edges
			for (Edge ie : inmap.get(k)) {
				if (ie.from > k) continue;
				for (int f = 0; f < N; f++) {
					if (k == f) continue;
					if (shortest[ie.from][f] > 0) {
						long update = shortest[ie.from][f] + ie.weight;
						if (update < shortest[k][f] || shortest[k][f] == 0) {
							baseSum += - shortest[k][f] + update;
							shortest[k][f] = update;
						}
					}
				}
			}
			// process out edges.
			TreeSet<Edge> queue = new TreeSet<>((e1, e2) -> {
				int flag = Integer.compare(e1.from, e2.from);
				if (flag != 0) return flag;
				return Long.compare(e1.weight, e2.weight);
			});
			for (Edge oe : outmap.get(k)) {
				for (int f = 0; f < N; f++) {
					if (oe.to == f || k == f) continue;
					if (shortest[k][f] > 0) {
						long update = shortest[k][f] + oe.weight;
						if (update < shortest[oe.to][f] || shortest[oe.to][f] == 0) {
							baseSum += - shortest[oe.to][f] + update;
							shortest[oe.to][f] = update;
							if (oe.to <= k) { // ダイクストラスタート
								queue.add(new Edge(f, oe.to, update));
							}
						}
					}
				}
			}
			
			while (!queue.isEmpty()) {
				Edge updated = queue.pollFirst();
				if (updated.to > k) continue;
				for (Edge oe : outmap.get(updated.to)) {
					if (oe.to == updated.from) continue;
					long update = shortest[updated.to][updated.from] + oe.weight;
					if (update < shortest[oe.to][updated.from] || shortest[oe.to][updated.from] == 0) {
						baseSum += - shortest[oe.to][updated.from] + update;
						shortest[oe.to][updated.from] = update;
						if (oe.to <= k) {
							queue.add(new Edge(updated.from, oe.to, update));
						}
					}
				}
			}
			
			sum += baseSum;
		}
		
		out.println(sum);
	}
	
	public static class Edge {
		public final int from;
		public final int to;
		public final long weight;
		public Edge(int from, int to, long weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
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
		/**
		 *  each element will be A_i + offset<br>
		 * O(N)
		 */
		public int[] nextIntArray(final int N, int offset) {
			int[] ret = new int[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextInt() + offset; }
			return ret;
		}
		/**
		 *  each element will be A_i + offset<br>
		 *  O(N)
		 */
		public long[] nextLongArray(final int N, long offset) {
			long[] ret = new long[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextLong() + offset; }
			return ret;
		}
		/**
		 * O(N)
		 * @param <T>
		 * @param arr
		 * @param suppl
		 * @return
		 */
		public <T> T[] nextObjArray(T[] arr, Function<FastScanner, T> suppl) {
			final int N = arr.length;
			for (int i = 0; i < N ; i++) { arr[i] = suppl.apply(this); }
			return arr;
		}
	}
	
	public static class AtMath {
		/**
		 * Returns 0 if n < r.<br>
		 * When n > 20 product will be grater than long_max.<br>
		 * O(n) or O(2min(r, n-r)) more precisely.
		 * @param n
		 * @param r
		 * @return nCr
		 */
		public static long nCr(int n, int r) {
			if (n < r) return 0;
			r = Math.min(r, n-r);
			if (r == 0) return 1;
			BigInteger res = BigInteger.valueOf(1L);
			final int d = n-r;
			for (int i = n; i > d; i--) { res = res.multiply(BigInteger.valueOf(i)); }
			for (int i = 2; i <= r; i++) { res = res.divide(BigInteger.valueOf(i)); }
			return res.longValue();
		}
		
		public static long fraction(int n) {
			long res = 1;
			for (int i = 1; i <= n; i++) { res *= i; }
			return res;
		}
		
		public static long longFratction(long n) { return bigFraction(n).longValueExact(); }
		
		public static BigInteger bigFraction(long n) {
			BigInteger res = BigInteger.ONE;
			for (long i = 2; i < n; i++) { res = res.multiply(BigInteger.valueOf(i)); }
			return res;
		}
		
		/**
		 * Use {@link Math#pow Math.pow} for double.
		 * @param x
		 * @param n
		 * @return
		 */
		public static long power(long x, int n) {
			assert(n >= 0);
			if (n == 0) return 1;
			if (n == 1) return x;
			long res = 1;
			for (int i = 31; i >= 0; i--) { // 31: number of bits of integer.
				res *= res;
				if ((n & (1<<i)) != 0) {res *= x;}
			}
			return res;
		}
		
		/**
		 * O(1) or strictly O(31).
		 * @param x
		 * @param n
		 * @param mod
		 * @return
		 */
		public static long power(long x, int n, long mod) {
			assert(n >= 0);
			if (n == 0) return 1;
			if (n == 1) return x;
			x %= mod;
			long res = 1;
			for (int i = 31; i >= 0; i--) { // 31: number of bits of integer.
				res *= res;
				res %= mod;
				if ((n & (1<<i)) != 0) {
					res *= x;
					res %= mod;
				}
			}
			return res;
		}
	}
	
	public void debug(String str) {
		if (DEBUG) System.out.println(str);
	}
	public void debug(boolean[] arr) {
		if (DEBUG) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.println(","); System.out.print(arr[i]); }
			System.out.println("]");
		}
	}
	public void debug(long[] arr) {
		if (DEBUG) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.println(","); System.out.print(arr[i]); }
			System.out.println("]");
		}
	}
	public void debug(double[] arr) {
		if (DEBUG) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.println(","); System.out.print(arr[i]); }
			System.out.println("]");
		}
	}
}
