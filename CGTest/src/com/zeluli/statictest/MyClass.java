package com.zeluli.statictest;

public class MyClass {
	TestClass test3 = new TestClass(3);								//2-3
	
	static TestClass test4 = new TestClass(4);						//2-1
	
	private int tag;
	public MyClass(int tag) {
		System.out.println("SecondClass"+tag+":被创建");				//2-4	
		this.tag = tag;
		test4.description();										//2-5
	}
	
	public void description() {
		System.out.println("SecondClass"+ tag +": description\n");
	}

	static TestClass test5 = new TestClass(5);						//2-2
}
