package com.zeluli.innerclass.demo2;

public class Main {
	public static void main(String[] args) {
		//创建序列并初始化
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		
		//获取序列迭代器，并通过迭代器来输出对象
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
