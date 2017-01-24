package com.wuyg.tool.thread;

public class Consume implements Runnable{
	
	private int num;
	
	private Storage storage;
	
	@Override
	public void run() {
		consume(num);
	}
	
	public Consume(Storage storage){
		this.storage = storage;
	}
	
	public void consume(int number){
		storage.consume(number);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
}
