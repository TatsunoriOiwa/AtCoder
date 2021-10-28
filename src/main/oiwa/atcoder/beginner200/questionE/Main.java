package oiwa.atcoder.beginner200.questionE;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		FastScanner sc = new FastScanner();
		final int N = sc.nextInt();
		final long K = sc.nextLong();
		
		long maxIndx = 0;
		for (int n = 1; n <= 3*N-2; n++) {
			long minIndx = maxIndx;
			maxIndx += tripleSet(n, N); // 和がn+2 以下であるような要素の数
//			AtLogger.println(tripleSet(n, N));
			if (K <= maxIndx) {
				maxIndx = minIndx;
				for (int m = 1; m <= n; m++) { // i = mであるような要素の数
					minIndx = maxIndx;
					maxIndx += n+2 - m - 1;
					if (K <= maxIndx) {
						maxIndx = minIndx;
						long jpk = n+2 - m;
						int j = (int) (K - minIndx);
						int k = (int) (jpk - j);
						System.out.println(m + " " + j + " " + k);
						return;
					}
				}
				// TODO:
			}
		}
	}
	
	private long tripleSet(int n, int N) {
		int nmax = 3*N-2;
		long NL = N+2;
		long nl = Math.min(n, 3*N - 1 - n);
		if (nl == nmax / 2 + nmax%2) {
			return NL*NL - (NL/2L)*(NL/2L + 1L);
		} else if (n == nmax / 2) {
			return NL*NL - (NL/2L)*(NL/2L);
		} else {
			return nl*(nl+1L)/2L;
		}
		// TODO:
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
