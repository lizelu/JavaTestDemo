package com.zeluli.statictest;

public class Main {
	static MyClass myClass = new MyClass(1);
	
	public static void main(String[] args) {
		System.out.println("Run Main Method");
		new MyClass(2);
		
		myClass.description();
		

		int[] a1;
		int[] a2 = {1, 2, 3, 4};
		a1 = a2;
		a1[0] = 0;
		System.out.println(a2[0]);
		
		String s1;
		String s2 = "aa";
		s1 = s2;
		s1 = "bb";
		System.out.println(s1);
		
	}
	
}
