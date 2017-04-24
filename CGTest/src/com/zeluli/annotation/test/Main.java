package com.zeluli.annotation.test;

public class Main {

	public static void main(String[] args) {
		System.out.println("================Method Annotation==============");
		AnnotationTracker.trackMethodAnnotation(TestClass.class);
		
		System.out.println("\n================Type Annotation==============");
		AnnotationTracker.trackTypeAnnotation(TestClass.class);;
	}

}
