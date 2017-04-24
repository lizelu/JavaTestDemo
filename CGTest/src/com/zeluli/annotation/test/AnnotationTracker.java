package com.zeluli.annotation.test;

import java.lang.reflect.Method;

public class AnnotationTracker {
	
	//获取方法注解
	public static void trackMethodAnnotation(Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {		//遍历有注解的方法
			MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);	//取出被UseCase注解的方法
			if (methodAnnotation != null) {
				System.out.println("描述信息:" + methodAnnotation.description());
			}
		}
	}
	
	//获取类型注解
	public static void trackTypeAnnotation(Class<?> cl) {
		TypeAnnotation typeAnnotation = cl.getAnnotation(TypeAnnotation.class);
		if (typeAnnotation != null) {
			System.out.println("class id:" + typeAnnotation.id());
		}
	}
}
