package com.zeluli.innerclass.callbacks;

public class Callee2{
	private int i = 0;
	
	public void increment() {
		System.out.print("Other:");
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable {
		@Override
		public void increment() {
			Callee2.this.increment();
		}
	}
	
	Incrementable getCallbackReference() {
		return new Closure();
	}
}
