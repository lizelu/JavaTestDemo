package com.zeluli.innerclass.callbacks;

public class Main {

	public static void main(String[] args) {
		Incrementable c1 = new Callee1();			//创建代理对象
		Caller caller1 = new Caller(c1);	//设置代理对象
		caller1.go();
		caller1.go();
		
		Callee2 c2 = new Callee2();
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller2.go();
		caller2.go();
		
	}

}
