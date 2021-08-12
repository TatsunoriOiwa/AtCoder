package oiwa.atcoder.util.cases;

import java.util.function.Function;

import oiwa.atcoder.util.CaseResult;

public class DummyPredicate implements Function<String, CaseResult> {
	@Override
	public CaseResult apply(String t) {
		return CaseResult.SKIP;
	}
}
