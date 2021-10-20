package oiwa.atcoder.beginner190.questionE2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

/**
 * ABC 190 E 2nd: 35 min
 * @author T.Oiwa
 *
 */
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
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		Map<Integer, List<Integer>> outs = new HashMap<>();
		for (int i = 0; i < N; i++) { outs.put(i, new ArrayList<>()); }
		
		for (int i = 0; i < M; i++) {
			int ai = sc.nextInt() - 1;
			int bi = sc.nextInt() - 1;
			outs.get(ai).add(bi);
			outs.get(bi).add(ai);
		}
		
		final int K = sc.nextInt();
		final int[] Cs = sc.nextIntArray(K, -1);
		
		long[][] dists = new long[K][K];
		for (int i = 0; i < K; i++) {
			long[] bfs = this.bfs(Cs[i], outs, N);
			for (int j = i+1; j < K; j++) {
				long d = bfs[Cs[j]];
				if (d == Long.MAX_VALUE) {
					out.println(-1);
					return;
				}
				dists[j][i] = dists[i][j] = d;
			}
			dists[i][i] = 0;
//			debug(dists[i]);
		}
		
		this.cache = new long[K][1 << K];
		for (int k = 0; k < K; k++) {
			Arrays.fill(cache[k], Long.MAX_VALUE);
			cache[k][0] = 0;
		}
		
		
		long res = Long.MAX_VALUE;
		for (int k = 0; k < K; k++) {
			long dist = this.shortest(k, ((1 << K) - 1) & ~(1 << k), dists, K);
			if (res > dist) res = dist;
		}
		out.println(res+1);
//		for (int k = 0; k < K; k++) {
//			debug(cache[k]);
//		}
	}
	
	private long[][] cache;
	private long shortest(int from, int set, long[][] dists, int K) {
		if (cache[from][set] < Long.MAX_VALUE) return cache[from][set];
		
		long min = Long.MAX_VALUE;
		for (int k = 0; k < K; k++) {
			if ((set & (1 << k)) > 0) {
				long dist =  dists[from][k] + shortest(k, set & ~(1 << k), dists, K);
				if (min > dist) min = dist;
			}
		}
		
		return cache[from][set] = min;
	}
	
	private long[] bfs(int from, Map<Integer, List<Integer>> outs, int N) {
		long[] dist = new long[N];
		Arrays.fill(dist, Long.MAX_VALUE);
		
		Deque<Integer> queue = new LinkedList<>();
		queue.offer(from);
		dist[from] = 0;
		while (!queue.isEmpty()) {
			int pos = queue.poll();
			long ndist = dist[pos]+ 1;
			for (int next : outs.get(pos)) {
				if (dist[next] > ndist) {
					dist[next] = ndist;
					queue.offer(next);
				}
			}
		}
		return dist;
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
		
		/**
		 * finds the minimum {@code i} that is {@code func(i) >= key}.<br>
		 * To get maximum {@code i} that is {@code func(i) < key}, subtract 1 from the result.<br>
		 * For {@code i} that is {@code func(i) > key}, use upper bound. For {@code func(i) <= key}, use upper bound -1.
		 * @param min
		 * @param max
		 * @param key
		 * @param func must be weakly increasing
		 * @return {@code min} if {@code key < func(min)}, {@code max + 1} if {@code func(max) < key}.
		 */
		public static long binarySearchLowerBound(long min, long max, long key, LongUnaryOperator func) {
			if (func.applyAsLong(min) >= key) return min;
			if (func.applyAsLong(max) < key) return max + 1;
			while (min < max - 1) {
				long mid = (min >> 1) + (max >> 1) + ((min&0b1) & (max&0b1));
				if (func.applyAsLong(mid) < key) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return max;
		}
		
		/**
		 * Finds the minimum {@code i} that is {@code func(i) > key}.<br>
		 * To get maximum {@code i} that is {@code func(i) <= key}, subtract 1 from the result.<br>
		 * For {@code i} that is {@code func(i) >= key}, use lower bound. For {@code func(i) < key}, use lower bound -1.
		 * @param min
		 * @param max
		 * @param key
		 * @param func
		 * @return {@code min} if {@code key < func(min)}, {@code max + 1} if {@code func(max) < key}.
		 */
		public static long binarySearchUpperBound(long min, long max, long key, LongUnaryOperator func) {
			if (func.applyAsLong(min) > key) return min;
			if (func.applyAsLong(max) <= key) return max + 1;
			while (min < max - 1) {
				long mid = (min >> 1) + (max >> 1) + ((min&0b1) & (max&0b1));
				if (func.applyAsLong(mid) <= key) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return max;
		}
		
		/**
		 * Returns the minimum long value that is "true".
		 * @param min
		 * @param max
		 * @param predicate Must return false for all values below threshold, and always return true if not．
		 * @return returns max+1 if not exist.
		 */
		public static long binarySearchPredicate(long min, long max, LongPredicate predicate) {
			if (predicate.test(min)) return min;
			if (!predicate.test(max)) return max+1;
			while (min < max - 1) {
				long mid = (min >> 1) + (max >> 1) + ((min&0b1) & (max&0b1));
				if (!predicate.test(mid)) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return max;
		}
	}
	
	public void debug(String str) { if (DEBUG) System.out.println(str); }
	public void debug(long val) { if (DEBUG) System.out.println(val); }
	public void debug(double val) { if (DEBUG) System.out.println(val); }
	public void debug(boolean val) { if (DEBUG) System.out.println(val); }
	public void debug(boolean[] arr) {
		if (DEBUG) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.print(","); System.out.print(arr[i]); }
			System.out.println("]");
		}
	}
	public void debug(long[] arr) {
		if (DEBUG) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.print(","); System.out.print(arr[i]); }
			System.out.println("]");
		}
	}
	public void debug(double[] arr) {
		if (DEBUG) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.print(","); System.out.print(arr[i]); }
			System.out.println("]");
		}
	}
}