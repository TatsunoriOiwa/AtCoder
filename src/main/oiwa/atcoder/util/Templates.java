package oiwa.atcoder.util;

public class Templates {

	/**
	 * ========================== ========================== ========================== ==========================
	 * @author T.Oiwa
	 * @date 2021/10/28
	 */
	public static class Tuple2l {
		public final long x;
		public final long y;
		public Tuple2l(long x, long y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Tuple2l) {
				Tuple2l other = (Tuple2l) obj; 
				return this.x == other.x && this.y == other.y;
			}
			return false;
		}
		@Override public int hashCode() { return Long.hashCode(x) * 31 + Long.hashCode(y); }
		@Override public String toString() { return "(" + x + "" + y + ")"; }
	}
	
	/**
	 * ========================== ========================== ========================== ==========================
	 * @author T.Oiwa
	 * @date 2021/10/28
	 */
	public static class Tuple2d {
		public final double x;
		public final double y;
		public Tuple2d(long x, long y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Tuple2d) {
				Tuple2d other = (Tuple2d) obj; 
				return this.x == other.x && this.y == other.y;
			}
			return false;
		}
		@Override public int hashCode() { return Double.hashCode(x) * 31 + Double.hashCode(y); }
		@Override public String toString() { return "(" + x + "" + y + ")"; }
	}
	
}
