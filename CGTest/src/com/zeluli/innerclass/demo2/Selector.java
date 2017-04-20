package com.zeluli.innerclass.demo2;

public interface Selector {
	boolean end();		//判断序列是否到了结尾处
	Object current();	//获取当前序列的值
	void next();		//指向序列的下一个值
}
