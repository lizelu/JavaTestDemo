package com.zeluli.annotaion;

import java.lang.reflect.Method;

public class UseCaseTracker {
	public static void trackUseCases(Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {		//遍历有注解的方法
			UseCase useCase = method.getAnnotation(UseCase.class);	//取出被UseCase注解的方法
			if (useCase != null) {
				System.out.println("Found Use Case:" + useCase.id() + 
						"description: " + useCase.desctiption());
			}
		}
	}
}
