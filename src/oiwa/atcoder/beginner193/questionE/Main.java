package oiwa.atcoder.beginner193.questionE;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.NoSuchElementException;

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
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			this.caze(out, sc);
		}
	}
	
	private void caze(PrintWriter out, FastScanner sc) {
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long P = sc.nextLong();
		long Q = sc.nextLong();
		
		long A = 2 * (X+Y);
		long B = P+Q;
		
		long tRes = Long.MAX_VALUE;
		
		for (long t1 = X; t1 < X+Y; t1++) {
			for (long t2 = P; t2 < P+Q; t2++) {
				long T = t2 - t1;
				
				long[] xyg = bezoutCoeff(A, -B);
				long x0 = xyg[0];
				long y0 = xyg[1];
				long g = xyg[2];
				if (T%g != 0) continue;
				
				for (long k = Math.floorDiv(-t*x0, b); k <= t*y0 / a; k++) {
					long nt = (t*x0 + k*b)*A+t1;
					if (t*x0+k*b >= 0 && t*y0-k*a >= 0) tRes = Math.min(tRes, nt);
				}
			}
		}
		if (tRes == Long.MAX_VALUE) { out.println("infinity"); }
		else { out.println(tRes); }
	}
	
	/**
	 * Computes Bezout coefficient from given a and b.<br>
	 * <code>ax + by = g</code>, where g is the GCD of a and b.<br>
	 * 
	 * @param a
	 * @param b
	 * @return int[] {x, y, g}
	 */
	public long[] bezoutCoeff(long a, long b) {
		long[] xyg = new long[3];
		boolean ainv = a < 0;
		boolean binv = b < 0;
		if (ainv) a = -a;
		if (binv) b = -b;
		boolean swap = a < b;
		if (swap) { long tmp = a; a = b; b = tmp; }
		xyg[2] = bezoutGcd(xyg, a, b);
		if (swap) { long tmp = xyg[0]; xyg[0] = xyg[1]; xyg[1] = tmp; }
		if (ainv) xyg[0] = -xyg[0];
		if (binv) xyg[1] = -xyg[1];
		return xyg;
	}
	
	private long bezoutGcd(long[] bezout, long a, long b) {
		long r = a%b;
		long gcd;
		if (r != 0) {
			gcd = this.bezoutGcd(bezout, b, r);
			long q = a/b;
			long tmp = bezout[0];
			bezout[0] = bezout[1];
			bezout[1] = tmp -q * bezout[1];
		} else {
			gcd = b;
			bezout[0] = 0;
			bezout[1] = 1;
		}
		return gcd;
	}
	
	/** 最大公約数 */
	public long gcd (long a, long b) { return b>0 ? gcd(b,a%b) : a; }
	/** 最小公倍数，オーバーフロー検査なし */
	public long lcm (long a, long b) { return a/gcd(a,b)*b; } // 割ってから掛けないとオーバーフロー，GCDなので必ず割り切れる．
	
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
			for (int i = 0; i < arr.length; i++) { if (i != 0) System.out.print(","); System.out.print(arr[i]); }
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
