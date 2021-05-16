package oiwa.atcoder.beginner201.questionC;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
//		out.flush();
	}
	
	
	private void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
//		int i = sc.nextInt();
//		String s = sc.next();
		String s = sc.next();
		int no = 0;
		int nq = 0;
		for (char c : s.toCharArray()) {
			if (c == 'o') {
				no++;
			} else if (c == '?') {
				nq++;
			}
		}
		if (no > 4) {
			System.out.println(0);
			return;
		}
		
		@SuppressWarnings("unused")
		int remain = 4 - no;
		long[] dp = new long[5];
		dp[0] = 1;
		for (int n = 0; n < no; n++) {
			long[] next = new long[5];
			for (int i = 0; i < 5; i++) { // から
				long mul = 1;
				for (int j = 1; j <= Math.min(4-i, 4-no+1); j++) {
					mul = mul * (4-i-j+1) / j;
					next[i+j] += dp[i] * mul;
				}
			}
			dp = next;
		}
		for (int n = 0; n < nq; n++) {
			long[] next = new long[5];
			for (int i = 0; i < 5; i++) { // から
				long mul = 1;
				next[i] += dp[i];
				for (int j = 1; j <= Math.min(4-i, 4-no); j++) {
					mul = mul * (4-i-j+1) / j;
					next[i+j] += dp[i] * mul;
				}
			}
			dp = next;
		}
		System.out.println(dp[4]);
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
