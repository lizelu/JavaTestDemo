package com.zeluli.innerclass.callbacks;

public class Caller {
	private Incrementable callbackReference;
	public Caller(Incrementable callback) {
		callbackReference = callback;
	}
	void go() {
		callbackReference.increment();
	}
}
