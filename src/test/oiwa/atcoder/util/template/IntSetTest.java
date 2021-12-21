package oiwa.atcoder.util.template;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

import oiwa.atcoder.util.template.Main.AtCollections;
import oiwa.atcoder.util.template.Main.AtCollections.IntIterator;
import oiwa.atcoder.util.template.Main.AtCollections.IntSet;

class IntSetTest {

	@Test
	void test() {
		
		IntSet set = new AtCollections.IntSet(8);
		set.add(2);
		set.add(8);
		set.add(3);
		set.add(7);
		set.rem(8);
		set.add(4);
		
		this.printAllProperties(set);
		System.out.println();
		
		assertTrue(true);
	}
	
	void removeTest() {
		System.out.println("******** remove test ********");
		
		// 削除処理 ()
		
	}
	
	@Test
	void rehashTest() {
		System.out.println("******** rehash test ********");
		Set<Integer> hashset = new HashSet<>();
		List<Integer> correct = new ArrayList<>();
		IntSet set = new AtCollections.IntSet(8);
		Random rand = new Random();
		final int N = 30;
		int[] ran = new int[N];
		
		for (int i = 0; i < N; i++) {
			int val = rand.nextInt() % 100;
			ran[i] = val;
			set.add(val);
			if (hashset.add(val)) {
				if (val != 0) correct.add(val); // add if not exists
				else correct.add(0, 0);
			}
		}
//		System.out.println(formatToString(correct.toArray(new Integer[correct.size()]), "% 3d"));
//		this.printAllProperties(set);
		
		int[] res;
		int[] ans;
		ans = tointArray(correct);
		res = tointArray(set);
//		System.out.println(set.size() + " " + correct.size());
//		System.out.println(formatToString(ans, "% 3d"));
//		System.out.println(formatToString(res, "% 3d"));
		assertArrayEquals(ans, res);
		
//		System.out.println("**** remove some ****");
		for (int i = 0; i < 10; i++) {
//			 System.out.println("remove " + ran[i]);
			if (set.rem(ran[i]) ^ correct.remove((Integer) ran[i])) System.out.println("aaaa!" + ran[i]);
//			this.printAllProperties(set);
		}
		ans = tointArray(correct);
		res = tointArray(set);
//		System.out.println(set.size() + " " + correct.size());
//		System.out.println(formatToString(ans, "% 3d"));
//		System.out.println(formatToString(res, "% 3d"));
		assertArrayEquals(ans, res);
		
		for (int i = 10; i < 20; i++) {
//			 System.out.println("remove " + ran[i]);
			if (set.rem(ran[i]) ^ correct.remove((Integer) ran[i])) System.out.println("aaaa!" + ran[i]);
//			this.printAllProperties(set);
		}
		ans = tointArray(correct);
		res = tointArray(set);
//		System.out.println(set.size() + " " + correct.size());
//		System.out.println(formatToString(ans, "% 3d"));
//		System.out.println(formatToString(res, "% 3d"));
		assertArrayEquals(ans, res);
		
		for (int i = 20; i < ran.length; i++) {
//			 System.out.println("remove " + ran[i]);
			if (set.rem(ran[i]) ^ correct.remove((Integer) ran[i])) System.out.println("aaaa!" + ran[i]);
//			this.printAllProperties(set);
		}
		ans = tointArray(correct);
		res = tointArray(set);
//		System.out.println(set.size() + " " + correct.size());
//		System.out.println(formatToString(ans, "% 3d"));
//		System.out.println(formatToString(res, "% 3d"));
		assertArrayEquals(ans, res);
	}
	
	@Test
	void randTest() {
		System.out.println("******** random value test ********");
		final int N = 1000_000;
//		final int V = 100;
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
//		boolean[] dum = new boolean[N];
		
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
	void addAndThenRemove() {
		System.out.println("******** addAndThenRemove ********");
		final int N = 1000_000;
//		final int V = 100;
		
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
		System.out.print(System.nanoTime() - time);
		time = System.nanoTime();
		for (int v : add) set.add(v);
		for (int v : rem) set.rem(v);
		System.out.println(System.nanoTime() - time);
	}
	
	private void printAllProperties(IntSet set) {
		try {
			String format = "% 4d";
			int capacity = getFieldFor(set, "capacity");
			int[] hashTable = getFieldFor(set, "hashTable");
			int[] overlap = getFieldFor(set, "overlap");
			int[] next = getFieldFor(set, "nextIndex");
			int[] prev = getFieldFor(set, "prevIndex");
			int filledHead = getFieldFor(set, "head");
			int filledTail = getFieldFor(set, "tail");
			
			System.out.println(capacity);
			int[] index = new int[capacity];
			for (int i = 0; i < capacity; i++) { index[i] = i; }
			System.out.println(formatToString(index, format));
			System.out.println(formatToString(hashTable, format));
			System.out.println(formatToString(overlap, format));
			System.out.println(formatToString(next, format));
			System.out.println(formatToString(prev, format));
			System.out.println(filledHead + " " + filledTail);
			
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}
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
	
	private String formatToString(int[] array, String format) {
		if (array == null) return "null";
		int iMax = array.length - 1;
		if (iMax == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			int val = array[i];
			b.append(String.format(format, val));
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}
	}
	
	private String formatToString(Integer[] array, String format) {
		if (array == null) return "null";
		int iMax = array.length - 1;
		if (iMax == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			int val = (int) array[i];
			b.append(String.format(format, val));
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}
	}
	
	private int[] tointArray(IntSet set) {
		int[] arr = new int[set.size()];
		IntIterator iter = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			arr[i] = iter.nextInt();
		}
		return arr;
	}
	
	private int[] tointArray(List<Integer> list) {
		int[] arr = new int[list.size()];
		Iterator<Integer> iter = list.iterator();
		for (int i = 0; i < list.size(); i++) {
			arr[i] = iter.next();
		}
		return arr;
	}
	
	// TODO: write stronger test, ont only speed test.
}
