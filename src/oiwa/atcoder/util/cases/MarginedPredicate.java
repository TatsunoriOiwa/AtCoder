package oiwa.atcoder.util.cases;

import java.util.function.Function;

import oiwa.atcoder.util.CaseResult;

public class MarginedPredicate implements Function<String, CaseResult> {
	
	private final double ans;
	private final double relErr;
	private final double absErr;
	
	public MarginedPredicate(String ans, double relErr, double absErr) {
		this.ans = Double.parseDouble(ans);
		this.relErr = relErr;
		this.absErr = absErr;
	}

	@Override
	public CaseResult apply(String t) {
		double result = Double.parseDouble(t);
		if (ans - absErr <= result && result <= ans + absErr) return CaseResult.SUCCESS;
		if (ans * (1 - relErr) <= result && result <= ans * (1 + relErr)) return CaseResult.SUCCESS;
		return null;
	}

}
