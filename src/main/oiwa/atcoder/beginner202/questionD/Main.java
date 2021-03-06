package oiwa.atcoder.beginner202.questionD;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
		out.flush();
	}
	
	
	public void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
		int A = sc.nextInt();
		int B = sc.nextInt();
		final long K = sc.nextLong();
		
		StringBuilder sb = new StringBuilder();
		
		long indx = 0;
		while(A+B > 0 && B > 0) {
			long tmp = nCr(A+B-1, B);
			if (indx + tmp >= K) { // εε
				sb.append("a");
				A--;
			} else { // εΎε
				sb.append("b");
				B--;
				indx += tmp;
			}
		}
		while (A > 0) {
			sb.append("a");
			A--;
		}
		out.println(sb.toString());
	}
	
	public long nCr(int n, int m) {
		if (n < m) return 0;
		BigInteger res = BigInteger.valueOf(1L);
//		m = Math.min(m, n-m);
//		System.out.println("n-m " + (n-m));
		for (int i = n; i > n-m; i--) {
			res = res.multiply(BigInteger.valueOf(i));
//			res *= i;
//			if (j >= 2) res /= j;
//			System.out.println("res=" + res);
		}
		for (int i = 2; i <= m; i++) {
//			res /= i;
			res = res.divide(BigInteger.valueOf(i));
		}
		return res.longValue();
	}
	
//	public long nCr(int n, int r) {
//		System.out.println("factN=" + fact(n) + " fact(r)=" + (fact(r)) + " " + (fact(n) / fact(r)));
//		return fact(n) / fact(r) / fact(n - r);
//	}
//
//	// Returns factorial of n
//	public long fact(int n) {
//		long res = 1;
//		for (int i = 2; i <= n; i++) res = res * i;
//		return res;
//	}
	
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
	
	public long power(long x, int n) {
		return this.power(x, n, Long.MAX_VALUE);
	}
	
	public long power(long x, int n, long mod) {
		assert(n >= 0);
		x %= mod;
		long res = 1;
		for (int i = 30; i >= 0; i--) {
			res %= mod;
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
