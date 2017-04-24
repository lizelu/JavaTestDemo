package com.zeluli.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Iterator;

public class AnnotationTracker {
	//获取类型注解
	public static void trackTypeAnnotation(Class<?> cl) {
		TypeAnnotation typeAnnotation = cl.getAnnotation(TypeAnnotation.class);
		if (typeAnnotation != null) {
			System.out.println("class id:" + typeAnnotation.id());
		}
	}
	
	//获取方法注解
	public static void trackMethodAnnotation(Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {		//遍历有注解的方法
			MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);	//取出被UseCase注解的方法
			if (methodAnnotation != null) {
				System.out.println("描述信息:" + methodAnnotation.description());
			}
			
			for (Parameter parameter : method.getParameters()) {
				ParameterAnnotation parameterAnnotation = parameter.getAnnotation(ParameterAnnotation.class);
				if (parameterAnnotation != null) {
					System.out.println("参数的注解信息:" + parameterAnnotation.value());
				}
			}
		}
	}
	
	//获取字段注解
	public static void trackFieldAnnotaion(Class<?> cl) {
		for (Field filed : cl.getDeclaredFields()) {		//遍历有注解的方法
			FieldAnnotation fieldAnnotation = filed.getAnnotation(FieldAnnotation.class);
			if (fieldAnnotation != null) {
				System.out.println("字段注解的值:" + fieldAnnotation.value());
			}
		}
	}
}
