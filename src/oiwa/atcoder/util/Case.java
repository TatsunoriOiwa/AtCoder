package oiwa.atcoder.util;

public class Case {
	private final boolean enabled;
	private final String test;
	private final String ans;
	
	public Case(String test, String ans) {
		this(true, test, ans);
	}
	
	public Case(boolean enabled, String test, String ans) {
		this.enabled = enabled;
		this.test = test;
		this.ans = ans;
	}
	
	public boolean isEnabled() { return this.enabled; }
	public String getTest() { return test; }
	public String getAns() { return ans; }
}