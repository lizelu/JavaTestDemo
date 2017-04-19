package com.zeluli.innerclass.interfaces;

public interface ClassInInterface {
	void howdy();
	
	class Test implements ClassInInterface {
		@Override
		public void howdy() {
			System.out.println("Howdy!");
		}
	}
}
