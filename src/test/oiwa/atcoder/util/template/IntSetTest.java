package oiwa.atcoder.util.template;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import oiwa.atcoder.util.template.Main.AtCollections;
import oiwa.atcoder.util.template.Main.AtCollections.IntSet;

class IntSetTest {

	@Test
	void test() {
		HashSet<Integer> correct = new HashSet<>();
		
		IntSet set = new AtCollections.IntSet(16);
		set.add(2);
		set.add(8);
		set.add(3);
		set.add(7);
		
		try {
			int[] values = getFieldFor(set, "values");
			int[] next = getFieldFor(set, "nextIndex");
			int[] prev = getFieldFor(set, "prevIndex");
			int filledHead = getFieldFor(set, "filledHead");
			int emptyHead = getFieldFor(set, "emptyHead");
			int[] hash2Index = getFieldFor(set, "hash2Index");
			int[] hashTable = getFieldFor(set, "hashTable");
			
			System.out.println(Arrays.toString(values));
			System.out.println(Arrays.toString(next));
			System.out.println(Arrays.toString(prev));
			System.out.println(filledHead + " " + emptyHead);
			System.out.println(Arrays.toString(hash2Index));
			System.out.println(Arrays.toString(hashTable));
			
			
			
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}
		 System.out.println();
		
		assertTrue(true);
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
}
