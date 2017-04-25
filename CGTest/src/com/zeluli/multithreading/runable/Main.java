package com.zeluli.multithreading.runable;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(new LiftOff());
			
//			if (i == 0) {
//				thread.setPriority(Thread.MIN_PRIORITY);
//			}
//			
//			if (i == 1) {
//				thread.setPriority(Thread.NORM_PRIORITY);
//			}
//			
//			if (i == 2) {
//				thread.setPriority(Thread.MAX_PRIORITY);
//			}
			
			
			thread.start();
		}
	}

}
