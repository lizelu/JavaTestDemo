package com.zeluli.escape;

public class EscapeTestCase {
	
	public static EscapeTestCase caseForEscape = null;
	
    @Override
    protected void finalize() throws Throwable {
       super.finalize();
       System.out.println("逃逸了！！");
       caseForEscape = this;
    }
}
