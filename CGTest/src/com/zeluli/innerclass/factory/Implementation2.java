package com.zeluli.innerclass.factory;

public class Implementation2 implements Service {
	
	//匿名内部类
	static ServiceFactory factory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation2();
		}
	};
	
	@Override
	public void method1() {
		System.out.println("Implementation2.method1()");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2.method2()");
	}

}
