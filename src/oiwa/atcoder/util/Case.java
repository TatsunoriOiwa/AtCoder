package oiwa.atcoder.util;

public class Case {
	private final boolean enabled;
	private final String test;
	private final String ans;
	
	/**
	 * for back compatibility.
	 * @param test
	 * @param ans
	 */
	public Case(String test, String ans) {
		this(true, test, ans);
	}
	
	public Case(boolean enabled, String test) {
		this(enabled, test, null);
	}
	
	public Case(boolean enabled, String test, String ans) {
		this.enabled = enabled;
		this.test = test;
		this.ans = ans == null || ans.endsWith("\r\n") ? ans : ans + "\r\n";
	}
	
	public boolean isEnabled() { return this.enabled; }
	public String getTest() { return test; }
	public String getAns() { return ans; }
}