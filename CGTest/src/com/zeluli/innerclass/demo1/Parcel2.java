package com.zeluli.innerclass.demo1;

public class Parcel2 {
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		
		public Destination(String whereTo) {
			label = whereTo;
		}
		
		String readLabel() {
			return label;
		}
	}
	
	public void ship(String dest) {
		Contents contents = new Contents();
		Destination destination = new Destination(dest);
		System.out.println(destination.readLabel() + contents.value());
	}
	
	public Destination destination(String des) {
		return new Destination(des);
	}
	
	public Contents content() {
		return new Contents();
	}
}
