package com.zeluli.innerclass.factory;

public class Factories {
	public static void service(ServiceFactory factory) {
		Service service = factory.getService();
		service.method1();
		service.method2();
	}
}
