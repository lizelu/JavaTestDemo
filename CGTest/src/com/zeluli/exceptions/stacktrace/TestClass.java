package com.zeluli.exceptions.stacktrace;

public class TestClass {

	public void firstMethod() {
		secondMethod();
	}
	
	public void secondMethod() {
		thirdMethod();
	}
	
	public void thirdMethod() {
		fourthMethod();
	}
	
	public void fourthMethod() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement item : e.getStackTrace()) {
				System.out.println(item.getMethodName());
			}
		}
	}
}
