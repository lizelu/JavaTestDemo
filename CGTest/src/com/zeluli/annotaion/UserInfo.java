package com.zeluli.annotaion;

public class UserInfo {
	@UseCase(id = 10, desctiption = "描述信息10")
	public String testMetho1() {
		return "UserInfo.testMethod1";
	}
	
	@UseCase(id = 11, desctiption = "描述信息11")
	public String testMetho2() {
		return "UserInfo.testMethod2";
	}
}
