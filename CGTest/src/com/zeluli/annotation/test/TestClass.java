package com.zeluli.annotation.test;

@CETypeAnnotation(id = 10)
public class TestClass {
	@CEFieldAnnotation(value = "成员属性注解")
	public String value;
	
	@CEMethodAnnotation(description = "我是TestClass.method1的描述信息")
	public void method1(@CEParameterAnnotation(value = "parameter info") String parameter) {
		
	}
}
