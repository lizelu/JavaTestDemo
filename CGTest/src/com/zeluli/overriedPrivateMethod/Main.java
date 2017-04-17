package com.zeluli.overriedPrivateMethod;

public class Main {
	private void description() {
		System.out.println("我是父类的描述方法");
	}
	public static void main(String[] args) {
		Main obj = new SubClass();
		obj.description();			//我是父类的描述方法
	}

}
