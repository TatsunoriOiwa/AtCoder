package oiwa.atcoder.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class StringOutputStream extends OutputStream {
	
	private byte[] bytes;
	private int pos = 0;
	
	public StringOutputStream() {
		this(32);
	}
	
	public StringOutputStream(int capacity) {
		this.bytes = new byte[capacity];
	}
	
	@Override
	public void write(int b) throws IOException {
		bytes[pos++] = (byte) b;
		if (pos >= bytes.length) {
			bytes = Arrays.copyOf(bytes, bytes.length*2);
		}
	}

	public String convert() {
		String ret = new String(this.bytes, 0, this.pos);
		this.pos = 0;
		return ret;
	}
}
