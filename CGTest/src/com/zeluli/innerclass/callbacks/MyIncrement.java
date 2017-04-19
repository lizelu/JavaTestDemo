package com.zeluli.innerclass.callbacks;

public class MyIncrement {
	static void f(MyIncrement mi) {
		mi.increment();
	}
	
	public void increment() {
		System.out.println("Other operation");
	}
}
