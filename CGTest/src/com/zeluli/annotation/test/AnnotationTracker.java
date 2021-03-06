package com.zeluli.annotation.test;

import java.lang.reflect.Constructor;
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
	
	//获取构造器注解
	public static void trackConstructorAnnotation(Class<?> cl) {
		for (Constructor<?> constructor : cl.getConstructors()) {		//遍历构造器
			CEConstructorAnnotation constructorAnnotation = constructor.getAnnotation(CEConstructorAnnotation.class);
			if (constructorAnnotation != null) {
				System.out.println("描述信息:" + constructorAnnotation.value());
			}
		}
	}
	
	//获取方法注解和参数注解
	public static void trackMethodAnnotation(Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {		//遍历有注解的方法
			CEMethodAnnotation methodAnnotation = method.getAnnotation(CEMethodAnnotation.class);//取出被CEMethodAnnotation注解的方法
			if (methodAnnotation != null) {
				System.out.println("描述信息:" + methodAnnotation.description());
			}
			
			for (Parameter parameter : method.getParameters()) {	//遍历方法参数
				CEParameterAnnotation parameterAnnotation = parameter.getAnnotation(CEParameterAnnotation.class);
				if (parameterAnnotation != null) {
					System.out.println("参数的注解信息:" + parameterAnnotation.value());
				}
			}
		}
	}
	
	//获取字段注解
	public static void trackFieldAnnotaion(Class<?> cl) {
		for (Field filed : cl.getDeclaredFields()) {		//遍历有注解的字段
			CEFieldAnnotation fieldAnnotation = filed.getAnnotation(CEFieldAnnotation.class);
			if (fieldAnnotation != null) {
				System.out.println("字段注解的值:" + fieldAnnotation.value());
			}
		}
	}
}
