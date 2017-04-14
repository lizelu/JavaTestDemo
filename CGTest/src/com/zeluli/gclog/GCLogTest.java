package com.zeluli.gclog;

public class GCLogTest {
	public static void main(String[] args) {
		String s = new String("Value");
		s = null;
		System.gc();
		
		String s1 = new String("s1");
		String s2 = new String("s1");
		String s3 = "s1";
		String s4 = "s1";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
