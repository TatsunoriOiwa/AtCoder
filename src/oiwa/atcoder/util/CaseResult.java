package oiwa.atcoder.util;

public enum CaseResult {
	SUCCESS("success"),
	SKIP("skip"),
	FAIL("fail");
	
	public final String message;
	
	private CaseResult(String message) { 
		this.message = message;
	}
}
