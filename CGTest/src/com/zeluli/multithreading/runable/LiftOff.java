package com.zeluli.multithreading.runable;

public class LiftOff implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public LiftOff() {
		// TODO Auto-generated constructor stub
	}
	
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ") ";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			output();
		}
	}
	
	public synchronized void output() {
		System.out.print(status());
		System.out.println(Thread.currentThread().getName());
		Thread.yield();
	}

}
