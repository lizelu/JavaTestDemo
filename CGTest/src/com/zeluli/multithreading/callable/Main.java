package com.zeluli.multithreading.callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//记录返回的值
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			results.add(executor.submit(new TaskWithResult(i)));
		}
		
		//迭代输出返回的值
		for (Future<String> future : results) {
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				executor.shutdown();
			}
		}
		
	}

}
