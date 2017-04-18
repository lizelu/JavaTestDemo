package com.zeluli.innerclass.demo3;

public class DotNew {
	void description() {
		System.out.println("DotNew.description()");
	}
	
	public class Inner {
		public DotNew self() {
			return DotNew.this;	//指向外类的指针
		}
	}
}
