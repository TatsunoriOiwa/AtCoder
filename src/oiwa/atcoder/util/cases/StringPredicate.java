package oiwa.atcoder.util.cases;

import java.util.function.Function;

import oiwa.atcoder.util.CaseResult;

public class StringPredicate implements Function<String, CaseResult> {
	
	private final String ansstr;
	
	public StringPredicate(String ansstr) {
		this.ansstr = ansstr.stripTrailing();
	}

	@Override
	public CaseResult apply(String t) {
		return this.ansstr.equals(t) ? CaseResult.SUCCESS : CaseResult.FAIL;
	}
}
