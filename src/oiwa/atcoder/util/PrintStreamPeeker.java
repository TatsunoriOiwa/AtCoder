package oiwa.atcoder.util;

import java.io.PrintStream;

public class PrintStreamPeeker extends PrintStream {

	public StringBuilder printList = null;
	private boolean peek = false;
	
	public PrintStreamPeeker(PrintStream org) {
		super(org);
	}
	
	public void peek() {
		this.peek = true;
		this.printList = new StringBuilder();
	}
	
	public void pause() {
		this.peek = false;
	}
	
	public void resume() {
		this.peek = true;
	}
	
	/**
	 * Stop peeking and return peeked results.
	 * @return
	 */
	public String convert() {
		this.peek = false;
		return this.printList == null ? "" : this.printList.toString();
	}
	
	@Override
	public void println(String line) {
		if (this.peek) { printList.append(line).append("\r\n");}
		else { super.println(line); }
	}
	
	@Override
	public void println(boolean line) {
		this.println(String.valueOf(line));
	}

	@Override
	public void println(char line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println(int line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println(long line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println(float line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println(double line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println(char[] line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println(Object line) {
		this.println(String.valueOf(line));
	}
	
	@Override
	public void println() {
		this.println("");
	}
	
	@Override
	public void print(String s) {
		if (this.peek) { printList.append(s);}
		else { super.print(s); }
	}
	
	@Override
	public void print(boolean b) {
		this.print(String.valueOf(b));
	}
	
	@Override
	public void print(char c) {
		this.print(String.valueOf(c));
	}
	
	@Override
	public void print(int i) {
		this.print(String.valueOf(i));
	}
	
	@Override
	public void print(long l) {
		this.print(String.valueOf(l));
	}
	
	@Override
	public void print(float f) {
		this.print(String.valueOf(f));
	}
	
	@Override
	public void print(double d) {
		this.print(String.valueOf(d));
	}
	
	@Override
	public void print(char[] s) {
		this.print(String.valueOf(s));

	}
	
	@Override
	public void print(Object obj) {
		this.print(String.valueOf(obj));
	}
}