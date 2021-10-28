package oiwa.atcoder.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamPeeker extends OutputStream {

	public StringBuilder printList = null;
	
	public PrintStreamPeeker(PrintStream org) {
//		super(org);
		this.printList = new StringBuilder();
	}
	
	/**
	 * Stop peeking and return peeked results.
	 * @return
	 */
	public String convert() {
		String result = this.printList.toString();
		this.printList = new StringBuilder();
		return result;
	}
	
	public void println(String line) {
		printList.append(line).append("\r\n");
	}
	
	public void println(boolean line) {
		this.println(String.valueOf(line));
	}

	public void println(char line) {
		this.println(String.valueOf(line));
	}
	
	public void println(int line) {
		this.println(String.valueOf(line));
	}
	
	public void println(long line) {
		this.println(String.valueOf(line));
	}
	
	public void println(float line) {
		this.println(String.valueOf(line));
	}
	
	public void println(double line) {
		this.println(String.valueOf(line));
	}
	
	public void println(char[] line) {
		this.println(String.valueOf(line));
	}
	
	public void println(Object line) {
		this.println(String.valueOf(line));
	}
	
	public void println() {
		this.println("");
	}
	
	public void print(String s) {
		printList.append(s);
	}
	
	public void print(boolean b) {
		this.print(String.valueOf(b));
	}
	
	public void print(char c) {
		this.print(String.valueOf(c));
	}
	
	public void print(int i) {
		this.print(String.valueOf(i));
	}
	
	public void print(long l) {
		this.print(String.valueOf(l));
	}
	
	public void print(float f) {
		this.print(String.valueOf(f));
	}
	
	public void print(double d) {
		this.print(String.valueOf(d));
	}
	
	public void print(char[] s) {
		this.print(String.valueOf(s));

	}
	
	public void print(Object obj) {
		this.print(String.valueOf(obj));
	}

	@Override
	@Deprecated
	public void write(int b) throws IOException {}
}