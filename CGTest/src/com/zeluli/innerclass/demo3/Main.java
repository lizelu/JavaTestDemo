package com.zeluli.innerclass.demo3;


public class Main {
	public static void main(String[] args) {
		//this
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().description();
		
		//new
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner(); // 创建DotNew中的Inner类的实例
		dni.self().description();
	}
}
