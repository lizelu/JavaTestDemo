package com.zeluli.subAndSuperField;

public class Main {

	public static void main(String[] args) {
		//sup1.tag = 0, sup1.getTag() = 1
		SuperClass sub1 = new SubClass();
		System.out.println("sup1.tag = " + sub1.tag + ", sup1.getTag() = " + sub1.getTag());
		
		//sup2.tag = 1, sup2.getTag() = 1, sup2.getSuperTag() = 0
		SubClass sub2 = new SubClass();
		System.out.println("sup2.tag = " + sub2.tag + ", sup2.getTag() = " + sub2.getTag() + ", sup2.getSuperTag() = " + sub2.getSuperTag());
	}

}
