package oiwa.atcoder.b_jsc2021.questionE;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	private static final String IMPOSSIBLE = "impossible";
	
	private void run() {
		FastScanner sc = new FastScanner();
//		int c = sc.nextInt();
//		String s = sc.next();
		final int targetLevel = sc.nextInt();
		String str = sc.next();
		this.recLevelOld(targetLevel, str, 0, 0, 1);
//		this.recLevel(targetLevel, str);
	}
	
	private void recLevelOld(final int target, String str, int level, long count, long stepMul) {
//		AtLogger.println(level + " " + str);
		int c = palindromeStep(str);
		if (level == target) {
			if (str.length() == 0) {
				System.out.println(count);
				return;
			}
			if (c == 0) {
				if (str.length() == 1) {
					System.out.println(IMPOSSIBLE);
				} else {
					System.out.println(1*stepMul + count);
				}
				return;
			} else {
				System.out.println(count);
				return;
			}
		} else if (str.length() == 0) {
			System.out.println(IMPOSSIBLE);
			return;
		}
		this.recLevelOld(target, str.substring(0, str.length()/2), level+1, count+c*stepMul, stepMul*2);
	}
	
	private int palindromeStep(String str) {
		int len = str.length();
		int l = 0;
		int r = len - 1;
		int c = 0;
		for (; l < r; l++, r--) {
			if (str.charAt(l) != str.charAt(r)) c++;
		}
		return c;
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
