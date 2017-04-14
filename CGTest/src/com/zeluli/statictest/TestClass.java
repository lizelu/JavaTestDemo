package com.zeluli.statictest;

public class TestClass {
	private int tag;
	public TestClass(int tag) {
		System.out.println("TestClass" + tag + " 被创建");
		this.tag = tag;
	}
	
	public void description() {
		System.out.println("TestClass" + tag + "：description\n");
	}
}
