package com.zeluli.multithreading.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.zeluli.multithreading.runable.LiftOff;

public class Main {
	public static void cachedThreadPool() {
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 2; i++) {
			executor.execute(new LiftOff());
		}
		executor.shutdown();
	}
	
	public static void fixedThreadPool(int count) {
		ExecutorService executor = Executors.newFixedThreadPool(count);
		for (int i = 0; i < 2; i++) {
			executor.execute(new LiftOff());
		}
		executor.shutdown();
	}
	
	public static void singleThreadPool() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 2; i++) {
			executor.execute(new LiftOff());
		}
		executor.shutdown();
	}

	public static void main(String[] args) {
		//cachedThreadPool();
		//fixedThreadPool(10);
		singleThreadPool();
	}
	
	

}
