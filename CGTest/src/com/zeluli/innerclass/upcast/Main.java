package com.zeluli.innerclass.upcast;

public class Main {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("ZeluLi");
	}
}
