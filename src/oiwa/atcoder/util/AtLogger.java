package oiwa.atcoder.util;

public class AtLogger {
	public static PrintStreamPeeker peeker;
	
	public static void println(String x) {
		peeker.pause();
		System.out.println(x);
		peeker.resume();
	}
	
	public static void println(int line) {
		println(String.valueOf(line));
	}
	
	public static void println(long line) {
		println(String.valueOf(line));
	}
	
	public static void println(float line) {
		println(String.valueOf(line));
	}
	
	public static void println(double line) {
		println(String.valueOf(line));
	}
	
	public static void println(boolean line) {
		println(String.valueOf(line));
	}
	
	public static void println(Object line) {
		println(String.valueOf(line));
	}
	
	public static void stacktrace(Exception e) {
		peeker.pause();
		e.printStackTrace();
		peeker.resume();
	}
}
