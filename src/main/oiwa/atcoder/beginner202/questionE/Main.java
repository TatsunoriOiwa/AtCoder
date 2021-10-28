package oiwa.atcoder.beginner202.questionE;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
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
		Map<Integer, List<Integer>> outmap = new HashMap<>();
		for (int i = 1; i < N; i++) {
			int p = sc.nextInt() - 1;
			List<Integer> ot;
			if (outmap.containsKey(p)) { ot = outmap.get(p); }
			else outmap.put(p, ot = new ArrayList<>());
			ot.add(i);
		}
		
		final int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			this.processQuery(outmap, sc.nextInt(), sc.nextInt(), out);
		}
	}
	
	private void processQuery(Map<Integer, List<Integer>> outmap, int U, int D, PrintWriter out) {
		int cnt = 0;
		// dfs
		LinkedList<Integer> dfs = new LinkedList<>();
		LinkedList<Integer> next = new LinkedList<>();
		int depth = 0;
		boolean effective = 0 == U;
		
		dfs.add(0);
		next.add(0);
		while(dfs.size() > 0) {
			int pos = dfs.peek();
			
			List<Integer> ot = outmap.get(pos);
			if (depth == D-1) { // 足して戻る
				dfs.pop();
				if(effective && ot != null) cnt += ot.size();
				depth--;
				continue;
			}
			int ni = next.pop();
			if (ot == null || ni >= ot.size()) { // 次がない場合戻る
				dfs.pop();
//				next.pop();
				depth--;
				if (pos == U) break;
				continue;
			}
			// 次へ行く
			int np = ot.get(ni);
			ni++;
			dfs.push(np);
			next.push(ni);
			next.push(0);
			depth++;
			if (np == U) effective = true;
			// TODO: 初めて訪れたときの処理
			
		}
		
		out.println(cnt);
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
