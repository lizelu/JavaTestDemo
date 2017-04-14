package com.zeluli.escape;

public class Escape {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(EscapeTestCase.caseForEscape);
		
		EscapeTestCase.caseForEscape = new EscapeTestCase();
	    System.out.println(EscapeTestCase.caseForEscape);
	    
	    EscapeTestCase.caseForEscape=null;
	    System.gc();
	    
	    Thread.sleep(1000);
	    System.out.println(EscapeTestCase.caseForEscape);

	}

}
