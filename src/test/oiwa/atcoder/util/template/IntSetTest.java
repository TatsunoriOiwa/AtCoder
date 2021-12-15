package oiwa.atcoder.util.template;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

import oiwa.atcoder.util.template.Main.AtCollections;
import oiwa.atcoder.util.template.Main.AtCollections.IntSet;

class IntSetTest {

	@Test
	void test() {
		HashSet<Integer> correct = new HashSet<>();
		
		IntSet set = new AtCollections.IntSet(8);
		set.add(2);
		set.add(8);
		set.add(3);
		set.add(7);
		set.rem(8);
		set.add(4);
		
		try {
			int[] values = getFieldFor(set, "values");
			int[] next = getFieldFor(set, "nextIndex");
			int[] prev = getFieldFor(set, "prevIndex");
			int filledHead = getFieldFor(set, "head");
			int filledTail = getFieldFor(set, "tail");
			int[] hash2Index = getFieldFor(set, "hash2Index");
			int[] hashTable = getFieldFor(set, "hashTable");
			
			System.out.println(Arrays.toString(values));
			System.out.println(Arrays.toString(next));
			System.out.println(Arrays.toString(prev));
			System.out.println(filledHead + " " + filledTail);
			System.out.println(Arrays.toString(hash2Index));
			System.out.println(Arrays.toString(hashTable));
			
			
			
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}
		 System.out.println();
		
		assertTrue(true);
	}
	
	@Test
	void randTest() {
		final int N = 1000_000;
		final int V = 100;
		int[] vals = new int[N];
		boolean[] addrem = new boolean[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			vals[i] = rand.nextInt(100);
			addrem[i] = rand.nextBoolean();
		}
		
		Set<Integer> correct = new HashSet<>(N);
		IntSet set = new IntSet(N);
		boolean[] ans = new boolean[N];
		boolean[] qwe = new boolean[N];
		boolean[] dum = new boolean[N];
		
		for (int n = 0; n < 10; n++) {
			long time = System.nanoTime();
			for (int i = 0; i < N; i++) {
				ans[i] = addrem[i] ? correct.add(vals[i]) : correct.remove(vals[i]);
			}
			System.out.println(System.nanoTime() - time);
			time = System.nanoTime();
			for (int i = 0; i < N; i++) {
				qwe[i] = addrem[i] ? set.add(vals[i]) : set.rem(vals[i]);
			}
			System.out.println(System.nanoTime() - time);
			time = System.nanoTime();
			for (int i = 0; i < N; i++) {
				qwe[i] = addrem[i] ? ans[i]: qwe[i];
			}
			System.out.println(System.nanoTime() - time);
		}
		
//		System.out.println(Arrays.toString(ans));
//		System.out.println(Arrays.toString(qwe));
		assertArrayEquals(ans, qwe);
	}
	
	@Test
	void addAndRemove() {
		final int N = 1000_000;
		final int V = 100;
		
		Set<Integer> correct = new HashSet<>(N);
		IntSet set = new IntSet(N);
		
		int[] add = new int[N];
		int[] rem = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			add[i] = rand.nextInt(N);
			rem[i] = rand.nextInt(N);
		}
		
		long time = System.nanoTime();
		for (int v : add) correct.add(v);
		for (int v : rem) correct.remove(v);
		System.out.println(System.nanoTime() - time);
		time = System.nanoTime();
		for (int v : add) set.add(v);
		for (int v : rem) set.rem(v);
		System.out.println(System.nanoTime() - time);
	}
	
	
	@SuppressWarnings("unchecked")
	private <T> T getFieldFor(Object obj, String name) {
		try {
			Field field = obj.getClass().getDeclaredField(name);
			field.setAccessible(true);
			return (T) field.get(obj);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// TODO: write stronger test, ont only speed test.
}
