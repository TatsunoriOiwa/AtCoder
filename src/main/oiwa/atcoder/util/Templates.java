package oiwa.atcoder.util;

public class Templates {

	/**
	 * ========================== ========================== ========================== ==========================
	 * @author T.Oiwa
	 * @date 2021/10/28
	 */
	public static class Tuple2l {
		public final long v1;
		public final long v2;
		public Tuple2l(long x, long y) {
			this.v1 = x;
			this.v2 = y;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Tuple2l) {
				Tuple2l other = (Tuple2l) obj; 
				return this.v1 == other.v1 && this.v2 == other.v2;
			}
			return false;
		}
		@Override public int hashCode() { return Long.hashCode(v1) * 31 + Long.hashCode(v2); }
		@Override public String toString() { return "(" + v1 + "," + v2 + ")"; }
	}
	
	/**
	 * ========================== ========================== ========================== ==========================
	 * @author T.Oiwa
	 * @date 2021/10/28
	 */
	public static class Tuple2d {
		public final double v1;
		public final double v2;
		public Tuple2d(double x, double y) {
			this.v1 = x;
			this.v2 = y;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Tuple2d) {
				Tuple2d other = (Tuple2d) obj; 
				return this.v1 == other.v1 && this.v2 == other.v2;
			}
			return false;
		}
		@Override public int hashCode() { return Double.hashCode(v1) * 31 + Double.hashCode(v2); }
		@Override public String toString() { return "(" + v1 + "," + v2 + ")"; }
	}
	
}
