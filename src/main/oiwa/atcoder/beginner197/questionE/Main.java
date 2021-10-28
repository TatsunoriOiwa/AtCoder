package oiwa.atcoder.beginner197.questionE;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/**
 * 2021/05/21 26 min.
 * @author Oiwa
 *
 */
public class Main {
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
		
		TreeMap<Integer, BEntry> map = new TreeMap<>(); // colour -> entry
		for (int i = 0; i < N; i++) {
			int pos = sc.nextInt();
			int col = sc.nextInt();
			if (map.containsKey(col)) {
				map.get(col).add(pos);
			}
			else {
				map.put(col, new BEntry(col, pos));
			}
		}
		
		/** sum, len */
		long[] sums = new long[2];
		long[] poss = new long[2];
		for (BEntry e : map.values()) {
			long[] nsum = new long[2];
			long[] npos = new long[2];
			
			{ // 小さい方から大きい方へ
				npos[0] = e.getMaxX();
				nsum[0] = Math.min(sums[0] + Math.abs(poss[0] - e.getMinX()), // 前回の終わりが大きい方から
						sums[1] + Math.abs(poss[1] - e.getMinX())); // 旋回の終わりが小さい方から
				nsum[0] += e.getDelta();
			}
			{ // 大きい方から小さい方へ
				npos[1] = e.getMinX();
				nsum[1] = Math.min(sums[0] + Math.abs(poss[0] - e.getMaxX()), // 前回の終わりが大きい方から
						sums[1] + Math.abs(poss[1] - e.getMaxX())); // 前回の終わりが小さい方から
				nsum[1] += e.getDelta();
				
			}
			sums = nsum;
			poss = npos;
		}
		long res = Math.min(sums[0] + Math.abs(poss[0]), sums[1] + Math.abs(poss[1]));
		out.println(res);
	}
	
	public static class BEntry implements Comparable<BEntry> {
		private final int colour;
		private int minX;
		private int maxX;
		
		public BEntry(int colour, int pos) {
			this.colour = colour;
			this.minX = pos;
			this.maxX = pos;
		}
		
		public void add(int pos) {
			if (pos < minX) this.minX = pos;
			else if (maxX < pos) this.maxX = pos;
		}
		
		

		public int getColour() {
			return colour;
		}

		public int getMinX() {
			return minX;
		}

		public int getMaxX() {
			return maxX;
		}
		
		public int getDelta() {
			return this.maxX - this.minX;
		}
		

		@Override
		public int compareTo(BEntry o) {
			return Integer.compare(this.colour, o.colour);
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
