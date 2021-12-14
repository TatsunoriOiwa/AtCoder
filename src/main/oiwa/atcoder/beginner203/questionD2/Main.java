package oiwa.atcoder.beginner203.questionD2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

public class Main {
	public static boolean DEBUG = false;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		new Main().run(out);
		out.flush();
	}
	
	
	public void run(PrintWriter out) {
		FastScanner sc = new FastScanner();
		
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		int[][] height = new int[N][];
		for (int i = 0; i < N; i++) height[i] = sc.nextIntArray(N);
		
		long min = AtMath.binarySearchPredicate(0, 1000_000_000, mid -> this.predicate(height, mid, N, K));
		out.println(min);
	}
	
	private boolean predicate(int[][] height, long threshold, int N, int K) {
		final int count = K*K / 2;
		
//		debug(threshold);
		int[][] cumulative2d = new int[N][N];
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0;j < N; j++) {
				if (height[i][j] > threshold) sum++;
				if (i > 0) cumulative2d[i][j] = cumulative2d[i-1][j];
				cumulative2d[i][j] += sum;
			}
//			debug(cumulative2d[i]);
		}
		
		for (int i0 = K-1; i0 < N; i0++) {
			for (int j0 = K-1; j0 < N; j0++) {
				int grater = cumulative2d[i0][j0];
				if (i0 >= K) grater -= cumulative2d[i0 - K][j0];
				if (j0 >= K) grater -= cumulative2d[i0][j0 - K];
				if (i0 >= K && j0 >= K) grater += cumulative2d[i0 - K][j0 - K];
				if (grater <= count) return true;
			}
		}
		return false;
	}
	
	
	// ==== Fast Util ====
	
	public static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) { return true; }
			else {
				ptr = 0;
				try { buflen = in.read(buffer); }
				catch (IOException e) { e.printStackTrace(); }
				if (buflen <= 0) { return false; }
			}
			return true;
		}
		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}
		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}
		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) { throw new NumberFormatException(); }
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}
		public double nextDouble() { return Double.parseDouble(next()); }
		public int[] nextIntArray(final int N) {
			int[] ret = new int[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextInt(); }
			return ret;
		}
		public long[] nextLongArray(final int N) {
			long[] ret = new long[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextLong(); }
			return ret;
		}
		/**
		 *  each element will be A_i + offset<br>
		 * O(N)
		 */
		public int[] nextIntArray(final int N, int offset) {
			int[] ret = new int[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextInt() + offset; }
			return ret;
		}
		/**
		 *  each element will be A_i + offset<br>
		 *  O(N)
		 */
		public long[] nextLongArray(final int N, long offset) {
			long[] ret = new long[N];
			for (int i = 0; i < N; i++) { ret[i] = this.nextLong() + offset; }
			return ret;
		}
		/**
		 * O(N)
		 * @param <T>
		 * @param arr
		 * @param suppl
		 * @return
		 */
		public <T> T[] nextObjArray(T[] arr, Function<FastScanner, T> suppl) {
			final int N = arr.length;
			for (int i = 0; i < N ; i++) { arr[i] = suppl.apply(this); }
			return arr;
		}
	}
	
	public static class AtMath {
		/**
		 * Returns 0 if n < r.<br>
		 * When n > 20 product will be grater than long_max.<br>
		 * O(n) or O(2min(r, n-r)) more precisely.
		 * @param n
		 * @param r
		 * @return nCr
		 */
		public static long nCr(int n, int r) {
			if (n < r) return 0;
			r = Math.min(r, n-r);
			if (r == 0) return 1;
			BigInteger res = BigInteger.valueOf(1L);
			final int d = n-r;
			for (int i = n; i > d; i--) { res = res.multiply(BigInteger.valueOf(i)); }
			for (int i = 2; i <= r; i++) { res = res.divide(BigInteger.valueOf(i)); }
			return res.longValue();
		}
		
		public static long fraction(int n) {
			long res = 1;
			for (int i = 1; i <= n; i++) { res *= i; }
			return res;
		}
		
		public static long longFratction(long n) { return bigFraction(n).longValueExact(); }
		
		public static BigInteger bigFraction(long n) {
			BigInteger res = BigInteger.ONE;
			for (long i = 2; i < n; i++) { res = res.multiply(BigInteger.valueOf(i)); }
			return res;
		}
		
		/**
		 * Use {@link Math#pow Math.pow} for double.
		 * @param x
		 * @param n
		 * @return
		 */
		public static long power(long x, int n) {
			assert(n >= 0);
			if (n == 0) return 1;
			if (n == 1) return x;
			long res = 1;
			for (int i = 31; i >= 0; i--) { // 31: number of bits of integer.
				res *= res;
				if ((n & (1<<i)) != 0) {res *= x;}
			}
			return res;
		}
		
		/**
		 * O(1) or strictly O(31).
		 * @param x
		 * @param n must be positive value.
		 * @param mod
		 * @return
		 */
		public static long power(long x, long n, long mod) {
			assert(n >= 0);
			if (n == 0) return 1;
			if (n == 1) return x;
			x %= mod;
			long res = 1;
			for (int i = 63; i >= 0; i--) { // 63: number of bits of long value. MSB == 0 is asserted.
				res *= res;
				res %= mod;
				if ((n & (1<<i)) != 0) {
					res *= x;
					res %= mod;
				}
			}
			return res;
		}
		
		/**
		 * finds the minimum {@code i} that is {@code func(i) >= key}.<br>
		 * To get maximum {@code i} that is {@code func(i) < key}, subtract 1 from the result.<br>
		 * For {@code i} that is {@code func(i) > key}, use upper bound. For {@code func(i) <= key}, use upper bound -1.
		 * @param min
		 * @param max inclusive
		 * @param key
		 * @param func must be weakly increasing
		 * @return {@code min} if {@code key < func(min)}, {@code max + 1} if {@code func(max) < key}.
		 */
		public static long binarySearchLowerBound(long min, long max, long key, LongUnaryOperator func) {
			if (func.applyAsLong(min) >= key) return min;
			if (func.applyAsLong(max) < key) return max + 1;
			while (min < max - 1) {
				long mid = (min >> 1) + (max >> 1) + ((min&0b1) & (max&0b1));
				if (func.applyAsLong(mid) < key) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return max;
		}
		
		/**
		 * Finds the minimum {@code i} that is {@code func(i) > key}.<br>
		 * To get maximum {@code i} that is {@code func(i) <= key}, subtract 1 from the result.<br>
		 * For {@code i} that is {@code func(i) >= key}, use lower bound. For {@code func(i) < key}, use lower bound -1.
		 * @param min
		 * @param max inclusive
		 * @param key
		 * @param func
		 * @return {@code min} if {@code key < func(min)}, {@code max + 1} if {@code func(max) < key}.
		 */
		public static long binarySearchUpperBound(long min, long max, long key, LongUnaryOperator func) {
			if (func.applyAsLong(min) > key) return min;
			if (func.applyAsLong(max) <= key) return max + 1;
			while (min < max - 1) {
				long mid = (min >> 1) + (max >> 1) + ((min&0b1) & (max&0b1));
				if (func.applyAsLong(mid) <= key) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return max;
		}
		
		/**
		 * Returns the minimum long value that is "true".<br>
		 * data must be [ false, false, ..., false, true, true, ... ]
		 * @param min
		 * @param max inclusive
		 * @param predicate Must return false for all values below threshold, and always return true if not．
		 * @return returns max+1 if not exist.
		 */
		public static long binarySearchPredicate(long min, long max, LongPredicate predicate) {
			if (predicate.test(min)) return min;
			if (!predicate.test(max)) return max+1;
			while (min < max - 1) {
				long mid = (min >> 1) + (max >> 1) + ((min&0b1) & (max&0b1));
				if (!predicate.test(mid)) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return max;
		}
		
		/**
		 * O(1)
		 * @param a
		 * @param b
		 * @param c
		 * @return
		 */
		public static long min(long a, long b, long c) {
			if (a < b) return a < c ? a : c;
			return b < c ? b : c;
		}
		
		/**
		 * O(1)
		 * @param a
		 * @param b
		 * @param c
		 * @return
		 */
		public static double min(double a, double b, double c) {
			if (a < b) return a < c ? a : c;
			return b < c ? b : c;
		}
		
		/**
		 * O(1)
		 * @param a
		 * @param b
		 * @param c
		 * @return
		 */
		public static long max(long a, long b, long c) {
			if (a < b) return a < c ? a : c;
			return b < c ? b : c;
		}
		
		/**
		 * O(1)
		 * @param a
		 * @param b
		 * @param c
		 * @return
		 */
		public static double max(double a, double b, double c) {
			if (a < b) return a < c ? a : c;
			return b < c ? b : c;
		}
		
		public long clamp(long val, long min, long max) {
			if (min < max) {
				long tmp = min;
				min = max; max = tmp;
			}
			if (val < min) return min;
			return val > max ? max : val;
		}
		
		public static <T> T reduce(T[] array, BinaryOperator<T> reducer, T initialValue) {
			T result = initialValue;
			for (T t : array) { result = reducer.apply(result, t); }
			return result;
		}
		
		public static long reduce(long[] array, LongBinaryOperator reducer, long initialValue) {
			long result = initialValue;
			for (long t : array) { result = reducer.applyAsLong(result, t); }
			return result;
		}
		
		public static double reduce(double[] array, DoubleBinaryOperator reducer, double initialValue) {
			double result = initialValue;
			for (double t : array) { result = reducer.applyAsDouble(result, t); }
			return result;
		}
		
		/**
		 * Computes Bezout coefficient from given a and b.<br>
		 * <code>xA + yB = g</code>, where g is the GCD of A and B.<br>
		 * <br>
		 * To obtain m and n such that <code> mA + nB = C </code>,
		 * C must be able to be expressed as <code>C = c g</code>.<br>
		 * <code>(c*x + k*b)A - (c*y - k*a)B = C</code><br>, k is an integer.
		 * 
		 * @param a
		 * @param b
		 * @return long[] {x, y, g}
		 */
		public static long[] bezoutCoeff(long a, long b) {
			long[] xyg = new long[3];
			boolean ainv = a < 0;
			boolean binv = b < 0;
			if (ainv) a = -a;
			if (binv) b = -b;
			boolean swap = a < b;
			if (swap) { long tmp = a; a = b; b = tmp; }
			xyg[2] = bezoutGcd(xyg, a, b);
			if (swap) { long tmp = xyg[0]; xyg[0] = xyg[1]; xyg[1] = tmp; }
			if (ainv) xyg[0] = -xyg[0];
			if (binv) xyg[1] = -xyg[1];
			return xyg;
		}
		
		private static long bezoutGcd(long[] bezout, long a, long b) {
			long r = a%b;
			long gcd;
			if (r != 0) {
				gcd = AtMath.bezoutGcd(bezout, b, r);
				long q = a/b;
				long tmp = bezout[0];
				bezout[0] = bezout[1];
				bezout[1] = tmp -q * bezout[1];
			} else {
				gcd = b;
				bezout[0] = 0;
				bezout[1] = 1;
			}
			return gcd;
		}
	}
	
	public static class AtCollections {
//		/** For dense mapping. ranging from 0 to N-1 */
//		public static class IntMap<V> {
//			
//			private static final Object NULL = new Object() {
//				@Override public int hashCode() { return 0; }
//				@Override public String toString() { return "IntMap.NULL"; }
//			};
//			private final int capacity;
//			private Object[] vals;
//			private Set<Integer> keySet = new HashSet<>();
//			private int size = 0;
//			
//			private Object maskNull(Object value) { return (value == null ? NULL : value); }
//			@SuppressWarnings("unchecked")
//			private V unmaskNull(Object value) { return (V)(value == NULL ? null : value); }
//			
//			public IntMap(int capacity) {
//				this.capacity = capacity;
//				this.vals = new Object[capacity];
//			}
//			public IntMap(IntMap<? extends V> m) {
//				this.capacity = m.capacity;
//				vals = m.vals.clone();
//				size = m.size;
//			}
//			public int size() { return this.size; }
//			public boolean containsKey(int key) {
//				return vals[key] != null;
//			}
//
//			public V get(Object key) {
//				return (isValidKey(key) ? get((int) key) : null);
//			}
//			public V get(int key) { return unmaskNull(vals[key]); }
//			public V put(int key, V value) {
//				Object oldValue = vals[key];
//				vals[key] = maskNull(value);
//				if (oldValue == null) size++;
//				this.keySet.add(key);
//				return unmaskNull(oldValue);
//			}
//			public V remove(int key) {
//				Object oldValue = vals[key];
//				vals[key] = null;
//				if (oldValue != null) size--;
//				this.keySet.remove(key);
//				return unmaskNull(oldValue);
//			}
//			private boolean isValidKey(Object key) {
//				if (key == null) return false;
//				return key instanceof Integer;
//			}
//			
//			public void putAll(IntMap<? extends V> m) {
//				IntMap<?> em = (IntMap<?>) m;
//				for (int i = 0; i < keyUniverse.length; i++) {
//					Object emValue = em.vals[i];
//					if (emValue != null) {
//						if (vals[i] == null)
//							size++;
//						vals[i] = emValue;
//					}
//				}
//			}
//			
//			public Set<Entry<Integer, V>> entrySet() {
//				return null;
//			}
//			
//		}
		
		public static class FenwickTree {
			public long[] array;
			private long[] value;
			private int size;
			
			public FenwickTree(int initialCapacity) {
				int capacity = 16;
				while (capacity < initialCapacity) capacity <<= 1;
				
				this.array = new long[capacity];
				this.value = new long[capacity];
				this.size = capacity;
			}
			
			/**
			 * returns the sum from 0 to index. {@code O(logN)}
			 * @param index the index before the last element to be summarised.
			 * @return 0 if index is negative.
			 */
			public long sum(int index) {
				if (index < 0) return 0;
				long sum = 0;
				while (index >= 0) {
					sum += array[index];
					index -= (index+1) & ~index;
				}
				return sum;
			}
			
			/**
			 * 
			 * @param begin inclusive
			 * @param end
			 * @return 
			 */
			public long sum(int begin, int end) {
				return sum(end) - sum(begin - 1);
			}
			
			/**
			 * Sets the given value. {@code O(logN)}
			 * @param index the index before the last element to be summarised.
			 * @param value the value to be set.
			 */
			public void set(int index, long value) {
				long delta = value - this.value[index];
				this.value[index] = value;
				while (index < size) {
					array[index] += delta;
					index += (index+1) & ~index;
				}
			}
			
			public void add(int index, long value) {
				this.value[index] += value;
				while (index < size) {
					array[index] += value;
					index += (index+1) & ~index;
				}
			}
		}
		
		public static class UnionFindTree {
			public final int[] nodeGroup; // 各頂点の属するグループ
			public final Map<Integer, Set<Integer>> member;
			private UnionFindTree(int capacity) {
				this.nodeGroup = new int[capacity];
				this.member = new HashMap<>(capacity);
			}
			public static UnionFindTree emptyTree(int capacity) {
				return new UnionFindTree(capacity);
			}
			public static UnionFindTree withNodes(int N) {
				UnionFindTree uft = new UnionFindTree(N);
				for (int i = 0; i < N; i++) { uft.addVertex(i); }
				return uft;
			}
			/** Add a unconnected new vertex. asserts that the vertex is not added yet. */
			public void addVertex(int n) {
				assert(this.member.get(n) == null);
				this.nodeGroup[n] = n;
				Set<Integer> set = new HashSet<>();
				set.add(n);
				member.put(n, set);
			}
			/** connect node i and j */
			public void connect(int i, int j) {
				int gi = this.nodeGroup[i];
				int gj = this.nodeGroup[j];
				if (gi == gj) return;
				Set<Integer> mi = member.get(gi);
				Set<Integer> mj = member.get(gj);
				if (mi.size() < mj.size()) {
					int          gt = gi; gi = gj; gj = gt;
					Set<Integer> mt = mi; mi = mj; mj = mt;
				} // mjの方が小さい
				member.remove(gj);
				for (int m : mj) { this.nodeGroup[m] = gi; }
				mi.addAll(mj);
				member.put(gi, mi);
			}
			/** returns the number of groups. */
			public int cardinality() {
				return this.member.size();
			}
			/** retrieves the member of the group to which the given node belongs. */
			public Set<Integer> getGroupMemberForVertex(int n) {
				return this.member.get(this.nodeGroup[n]);
			}
			/** returns the number of member in the group to which given node belongs. */
			public int getGroupSizeForVertex(int n) {
				return this.getGroupMemberForVertex(n).size();
			}
		}
	}
	
	public void debug(String str) { if (DEBUG) System.out.println(str); }
	public void debug(long val) { if (DEBUG) System.out.println(val); }
	public void debug(double val) { if (DEBUG) System.out.println(val); }
	public void debug(boolean val) { if (DEBUG) System.out.println(val); }
	public void debug(Object obj) { if (DEBUG) System.out.println(obj); }
	public void debug(boolean[] arr) { if (DEBUG) System.out.println(Arrays.toString(arr)); }
	public void debug(long[] arr) { if (DEBUG) System.out.println(Arrays.toString(arr)); }
	public void debug(int[] arr) { if (DEBUG) System.out.println(Arrays.toString(arr)); }
	public void debug(double[] arr) { if (DEBUG) System.out.println(Arrays.toString(arr)); }
	public <T> void debug(T[] arr) { if (DEBUG) System.out.println(Arrays.toString(arr)); }
}
