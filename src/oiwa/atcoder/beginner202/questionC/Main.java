package oiwa.atcoder.beginner202.questionC;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
		out.flush();
	}
	
	
	public void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
		
		final int N = sc.nextInt();
		int[] A = sc.nextIntArray(N);
		int[] B = sc.nextIntArray(N);
		int[] C = sc.nextIntArray(N);
//		for (int i = 0; i < N; i++) { C[i]--;}
		
		// インデックスがAの値，その値を取る要素の数
		int[] Acnt = new int[N];
		for (int a : A) {
			Acnt[a]++;
		}
		
		// ある値 -> その値を取るBのインデックスのリスト
		Map<Integer, List<Integer>> val2BIndx = new HashMap<>();
		for (int bi = 0; bi < N; bi++) {
			int b = B[bi];
			List<Integer> list;
			if (val2BIndx.containsKey(b)) {
				list = val2BIndx.get(b);
			} else {
				val2BIndx.put(b, list = new LinkedList<>());
			}
			list.add(bi);
		}
		int[] Ccnt = new int[N];
		for (int c : C) {
			Ccnt[c]++;
		}
		
		long res = 0;
		for (int av = 0; av < N; av++) {
			int ac = Acnt[av];
			if (ac == 0) continue;
			long tmp = 0;
			if (!val2BIndx.containsKey(av)) continue;
			for (int bi : val2BIndx.get(av)) {
				tmp += Ccnt[bi];
			}
			res += tmp*ac;
		}
		out.println(res);
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
			for (int i = 0; i < N; i++) { ret[i] = this.nextInt()-1; }
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
