package oiwa.atcoder.util;

import java.util.function.Function;

import oiwa.atcoder.util.cases.DummyPredicate;
import oiwa.atcoder.util.cases.MarginedPredicate;
import oiwa.atcoder.util.cases.StringPredicate;

public class Case {
	private final boolean enabled;
	private final String test;
	private final String ans;
	private final Function<String, CaseResult> predicate;
	
	/**
	 * for back compatibility.
	 * @param test
	 * @param ans
	 */
	public Case(String test, String ans) {
		this(true, test, ans);
	}
	
	public Case(boolean enabled, String test) {
		this(enabled, test, "-skip-", new DummyPredicate());
	}
	
	public Case(boolean enabled, String test, String ans) {
		this(enabled, test, ans, new StringPredicate(ans));
	}
	
	public Case(boolean enabled, String test, String ans, double err) {
		this(enabled, test, ans, err, err);
	}
	
	public Case(boolean enabled, String test, String ans, double absErr, double relErr) {
		this(enabled, test, ans, new MarginedPredicate(ans, relErr, absErr));
	}
	
	public Case(boolean enabled, String test, String ans, Function<String, CaseResult> predicate) {
		this.enabled = enabled;
		this.test = test;
		this.ans = ans.stripTrailing();
		this.predicate = predicate;
	}
	
	public boolean isEnabled() { return this.enabled; }
	public String getTest() { return test; }
	
	/**
	 * return string representation of the answer.
	 * @return
	 */
	public String getAns() { return ans; }
	
	public CaseResult predicate(String ans) {
		return this.predicate.apply(ans);
	}
}