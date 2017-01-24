package com.wuyg.tool.thread;
/**
 * 生产者
 * @author wuyg15871
 *
 */
public class Produce implements Runnable {
	
	private int num;
	
	private Storage storage;
	
	public Produce(Storage storage){
		this.storage = storage;
	}
	
	public void run() {
		produce(num);
	}
	
	public void produce(int number){
		storage.produce(number);
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
