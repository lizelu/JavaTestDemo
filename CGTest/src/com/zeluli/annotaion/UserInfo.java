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
	
	@UseCase(id = 12, desctiption = "描述信息12")
	public String testMetho3() {
		return "UserInfo.testMethod3";
	}
	
	@UseCase(id = 13, desctiption = "描述信息13")
	public String testMetho4() {
		return "UserInfo.testMethod4";
	}
}
