package com.zeluli.innerclass.demo2;
public class Sequence {
	private Object[] items;		//用来存储对象的数组
	private int next = 0;		//数组的下标
	
	public Sequence(int size) {
		items = new Object[size];
	}
	//添加新的元素
	public void add(Object item) {
		if (next < items.length) {
			items[next++] = item;
		}
	}
	//创建迭代器并返回
	public Selector selector() {
		return new SequenceSelector();
	}
	//迭代器内部类
	private class SequenceSelector implements Selector {
		private int i = 0;	//下标
		@Override
		public boolean end() {
			return i == items.length;
		}
		@Override
		public Object current() {
			return items[i];
		}
		@Override
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
	}
}
