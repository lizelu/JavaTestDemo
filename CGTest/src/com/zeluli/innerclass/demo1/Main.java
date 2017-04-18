package com.zeluli.innerclass.demo1;

public class Main {

	public static void main(String[] args) {
		Parcel1 parcel = new Parcel1();
		parcel.ship("LuDashi");
		
		//============================
		Parcel2 parcel2 = new Parcel2();
		Parcel2.Contents content = parcel2.content();
		Parcel2.Destination destination = parcel2.destination("ZeluLi");
		System.out.println(destination.readLabel() + content.value());

	}

}
