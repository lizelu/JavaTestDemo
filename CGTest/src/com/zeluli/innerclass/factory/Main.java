package com.zeluli.innerclass.factory;

public class Main {
	public static void main(String[] args) {
		System.out.println("========传入Implementation1的工厂===========");
		Factories.service(Implementation1.factory);
		
		System.out.println("\n========传入Implementation2的工厂===========");
		Factories.service(Implementation2.factory);
	}
}
