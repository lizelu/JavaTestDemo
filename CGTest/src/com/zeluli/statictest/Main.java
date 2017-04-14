package com.zeluli.statictest;

public class Main {
	static MyClass myClass = new MyClass(1);
	
	public static void main(String[] args) {
		new MyClass(2);									
		myClass.description();						
	}
	
}
