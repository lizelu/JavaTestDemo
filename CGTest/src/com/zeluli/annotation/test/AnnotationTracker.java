package com.zeluli.annotation.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationTracker {
	//获取类型注解
	public static void trackTypeAnnotation(Class<?> cl) {
		CETypeAnnotation ceTypeAnnotation = cl.getAnnotation(CETypeAnnotation.class);
		if (ceTypeAnnotation != null) {
			System.out.println("class id:" + ceTypeAnnotation.id());
		}
	}
	
	//获取方法注解
	public static void trackMethodAnnotation(Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {		//遍历有注解的方法
			CEMethodAnnotation methodAnnotation = method.getAnnotation(CEMethodAnnotation.class);	//取出被UseCase注解的方法
			if (methodAnnotation != null) {
				System.out.println("描述信息:" + methodAnnotation.description());
			}
			
			for (Parameter parameter : method.getParameters()) {
				CEParameterAnnotation parameterAnnotation = parameter.getAnnotation(CEParameterAnnotation.class);
				if (parameterAnnotation != null) {
					System.out.println("参数的注解信息:" + parameterAnnotation.value());
				}
			}
		}
	}
	
	//获取字段注解
	public static void trackFieldAnnotaion(Class<?> cl) {
		for (Field filed : cl.getDeclaredFields()) {		//遍历有注解的方法
			CEFieldAnnotation fieldAnnotation = filed.getAnnotation(CEFieldAnnotation.class);
			if (fieldAnnotation != null) {
				System.out.println("字段注解的值:" + fieldAnnotation.value());
			}
		}
	}
}
