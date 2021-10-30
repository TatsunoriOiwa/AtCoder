package oiwa.atcoder.templates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import oiwa.atcoder.util.template.Main;

class BinSearch {

	@Test
	void test() {
		boolean[] arr = new boolean[] { false, false, false, true, true };
		long[] res = new long[3];
		long[] expected = new long[3];
		res[0]= Main.AtMath.binarySearchPredicate(0, arr.length-1, i -> arr[(int) i]);
		expected[0] = 3;
		res[1]= Main.AtMath.binarySearchPredicate(0, 3, i -> arr[(int) i]);
		expected[1] = 3;
		res[2]= Main.AtMath.binarySearchPredicate(0, 1, i -> arr[(int) i]);
		expected[2] = 2;
		Assertions.assertArrayEquals(expected, res);
	}
	
}
