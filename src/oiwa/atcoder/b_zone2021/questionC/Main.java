package oiwa.atcoder.b_zone2021.questionC;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		Ability[] initial = new Ability[N];
		Ability[] dp = new Ability[N*4];
		for (int i = 0; i < N; i++) {
			dp[i] = initial[i] = new Ability(1, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
//		for (int f = 0; f < N; f++) {
//			int t = f + N;
//			for (int n = 0; n < N; n++) {
//				Ability cand = dp[f].merge(initial[n]);
//				if (dp[t] == null || dp[t].totalPow() < cand.totalPow()) {
//					dp[t] = cand;
//				}
//			}
//		}
//		for (int f = 0; f < N*2; f++) {
//			int t = f + N*2;
//			for (int n = 0; n < N; n++) {
//				Ability cand = dp[f].merge(initial[n]);
//				if (dp[t] == null || dp[t].totalPow() < cand.totalPow()) {
//					dp[t] = cand;
//				}
//			}
//		}
		
		for (int i = 0; i < N; i++) {
			for (int n1 = 0; n1 < N; n1++) {
				for (int n2 = n1+1; n2 < N; n2++) {
					Ability cand = dp[i].merge(initial[n1]).merge(initial[n2]);
					if (dp[i].totalPow() < cand.totalPow()) {
						dp[i] = cand;
					}
				}
			}
		}
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			if (dp[i].totalPow() > ans) {
				ans = dp[i].totalPow();
			}
		}
		System.out.println(ans);
	}
	
	public static class Ability {
		private final int count;
		private final long a;
		private final long b;
		private final long c;
		private final long d;
		private final long e;
		private final long pow;
		public Ability(int count, long a, long b, long c, long d, long e) {
			this.count = count;
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			long[] arr = new long[] { a, b, c, d, e };
			Arrays.sort(arr);
			this.pow = arr[0];
		}
		
		public Ability merge(Ability other) {
			return new Ability(
					this.count + 1,
					Math.max(this.a, other.a),
					Math.max(this.b, other.b),
					Math.max(this.c, other.c),
					Math.max(this.d, other.d),
					Math.max(this.e, other.e));
		}
		
		public long totalPow() {
			return this.pow;
		}
		
		
	}
	
	// ==== Fast Util ====
	
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
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
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
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
	    public double nextDouble() { return Double.parseDouble(next());}
	}
}
