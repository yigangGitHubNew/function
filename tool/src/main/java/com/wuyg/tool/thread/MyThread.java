package com.wuyg.tool.thread;

public class MyThread implements Runnable{

	public void run() {
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		Runnable rt1 = new MyThread();
		Runnable rt2 = new MyThread();
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		t1.start();
		t2.start();
	}

}
