package oiwa.atcoder.templates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import oiwa.atcoder.util.template.Main.AtMath;

class Bezout {

	@Test
	void test最大公約数１であるもの() {
		long A = 10;
		long B = 3;
		long[] xyg = AtMath.bezoutCoeff(A, B);
		Assertions.assertArrayEquals(new long[] { 0, 0, xyg[2] }, new long[] { A % xyg[2], B % xyg[2],  xyg[0] * A + xyg[1]*B });
	}
	
	@Test
	void test最大公約数が１でない場合() {
		long A = 10;
		long B = 6;
		long[] xyg = AtMath.bezoutCoeff(A, B);
		Assertions.assertArrayEquals(new long[] { 0, 0, xyg[2] }, new long[] { A % xyg[2], B % xyg[2],  xyg[0] * A + xyg[1]*B });
	}
	
	@Test
	void test一方が他方で割り切れるもの() {
		long A = 12;
		long B = 6;
		long[] xyg = AtMath.bezoutCoeff(A, B);
		Assertions.assertArrayEquals(new long[] { 0, 0, xyg[2] }, new long[] { A % xyg[2], B % xyg[2],  xyg[0] * A + xyg[1]*B });
	}
	
	@Test
	void test大小関係が逆() {
		long A = 6;
		long B = 12;
		long[] xyg = AtMath.bezoutCoeff(A, B);
		Assertions.assertArrayEquals(new long[] { 0, 0, xyg[2] }, new long[] { A % xyg[2], B % xyg[2],  xyg[0] * A + xyg[1]*B });
	}
	
	@Test
	void test負の数を含む場合() {
		long A = -12;
		long B = 6;
		long[] xyg = AtMath.bezoutCoeff(A, B);
		Assertions.assertArrayEquals(new long[] { 0, 0, xyg[2] }, new long[] { A % xyg[2], B % xyg[2],  xyg[0] * A + xyg[1]*B });
	}
}
