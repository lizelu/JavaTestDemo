package com.zeluli.innerclass.demo3;

public class DotThis {
	void description() {
		System.out.println("DotThis.description()");
	}
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;	//指向外类的指针
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
}
