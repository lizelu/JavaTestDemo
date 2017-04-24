package com.zeluli.annotation.test;

@TypeAnnotation(id = 10)
public class TestClass {
	@FieldAnnotation(value = "成员属性注解")
	public String value;
	
	@MethodAnnotation(description = "我是TestClass.method1的描述信息")
	public void method1() {}
}
