package com.zeluli.annotation.test;

public class Main {

	public static void main(String[] args) {
		System.out.println("================Type Annotation==============");
		AnnotationTracker.trackTypeAnnotation(TestClass.class);
		
		System.out.println("\n================Method Annotation==============");
		AnnotationTracker.trackMethodAnnotation(TestClass.class);
		
		System.out.println("\n================Field Annotation==============");
		AnnotationTracker.trackFieldAnnotaion(TestClass.class);
	}

}
