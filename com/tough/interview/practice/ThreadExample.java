package com.tough.interview.practice;

public class ThreadExample implements Runnable {
	public void run() {
		System.out.printf("GFG ");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new ThreadExample());
		thread1.start();
		//thread1.start();
		System.out.println(thread1.getState());
	}
}
