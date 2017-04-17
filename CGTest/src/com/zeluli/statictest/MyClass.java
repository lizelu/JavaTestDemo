package com.zeluli.statictest;

public class MyClass {
	TestClass test1 = new TestClass(1);								
	
	static TestClass test2 = new TestClass(2);					
	
	private int tag;
	public MyClass(int tag) {
		System.out.println("MyClass"+tag+":被创建");					
		this.tag = tag;
		test2.description();										
	}
	
	public void description() {
		System.out.println("MyClass"+ tag +": description\n");
	}

	static TestClass test3 = new TestClass(3);				
}
