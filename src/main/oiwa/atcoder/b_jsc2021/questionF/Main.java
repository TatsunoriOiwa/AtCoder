package oiwa.atcoder.b_jsc2021.questionF;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	
	private void run() {
		PrintWriter out = new PrintWriter(System.out);
		FastScanner sc = new FastScanner();
//		int c = sc.nextInt();
//		String s = sc.next();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		long sum = 0;
		int[] as = new int[N];
		int[] bs = new int[M];
		int[][] mat = new int[N][M];
//		for (int i = 0; i < N; i++) { mat[i] = new int[M]; }
		
		for (int i = 0; i < Q; i++) {
			int T = sc.nextInt();
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt();
			switch(T) {
			case 1:
				int ax = as[X] = Y;
				for (int b = 0; b < M; b++) {
					int prev = mat[X][b];
					sum += (mat[X][b] = Math.max(ax, bs[b])) - prev;
				}
				break;
			case 2:
				int bx = bs[X] = Y;
				for (int a = 0; a < N; a++) {
					int prev = mat[a][X];
					sum += (mat[a][X] = Math.max(as[a], bx)) - prev;
				}
				break;
			default:
				assert(false);
			}
			out.println(sum);
		}
		out.flush();
	}
	
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
