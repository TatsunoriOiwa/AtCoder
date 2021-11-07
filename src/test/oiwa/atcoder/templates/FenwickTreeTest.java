package oiwa.atcoder.templates;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import oiwa.atcoder.util.template.Main.AtCollections.FenwickTree;

class FenwickTreeTest {
	
	@Test
	void test() {
		int size = 5;
		FenwickTree tree = new FenwickTree(size);
		tree.set(0, 1); // 1 0 0 0 0
		Assertions.assertArrayEquals(new long[] { 1, 1, 1, 1, 1 }, sumArray(tree, size));
		tree.set(3, 4); // 1 0 0 4 0
		Assertions.assertArrayEquals(new long[] { 1, 1, 1, 5, 5 }, sumArray(tree, size));
		tree.set(2, 3); // 1 0 3 4 0
		Assertions.assertArrayEquals(new long[] { 1, 1, 4, 8, 8 }, sumArray(tree, size));
		tree.set(4, 5); // 1 0 3 4 5
		Assertions.assertArrayEquals(new long[] { 1, 1, 4, 8,13 }, sumArray(tree, size));
		tree.set(2,-2); // 1 0 -2 4 5
		Assertions.assertArrayEquals(new long[] { 1, 1,-1, 3, 8 }, sumArray(tree, size));
	}
	
	@Test
	void randomTest() {
		int size = 100_000;
		FenwickTree tree = new FenwickTree(size);
		long[] array = new long[size];
		Random rand = new Random();
		
		for (int i = 0; i < 10000; i++) {
			long r = rand.nextInt(1000_000_000);
			int pos = rand.nextInt(size);
			array[pos] += r;
			tree.add(pos, r);
			Assertions.assertArrayEquals(directSummation(array, size), sumArray(tree, size));
		}
		
	}
	
	private long[] sumArray(FenwickTree tree, int size) {
		long[] ret = new long[size];
		for (int i = 0; i < size; i++) {
			ret[i] = tree.sum(i);
		}
		return ret;
	}
	
	private long[] directSummation(long[] array, int size) {
		long[] ret = new long[size];
		long prev = 0;
		for (int i = 0; i < size; i++) {
			prev = ret[i] = prev + array[i];
		}
		return ret;
	}
}
