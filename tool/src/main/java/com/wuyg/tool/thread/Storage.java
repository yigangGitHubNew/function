package com.wuyg.tool.thread;

import java.util.LinkedList;

public class Storage{
	private static int MAX_SIZE = 100;
	
	private LinkedList<String> warehouse = new LinkedList<String>();
	
	public void produce(int num){
		synchronized(this){
			if(warehouse.size()+num > MAX_SIZE){
				System.out.println("【已经超过仓库的最大容量了,要生成的产品是"+num+",仓库的容量大小是+"+warehouse.size()+"】");
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i = 0; i < num; i++){
				warehouse.add(i+"");
			}
			notify();
			System.out.println("生产的产品是"+num+";仓库的容量大小是："+warehouse.size());
		}
	}
	
	
	public void consume(int num){
		synchronized (this) {
			if(num > warehouse.size()){
				System.out.println("已经小于仓库的库存量，当前消费的产品是："+num+"；仓库容量的大小是:"+warehouse.size());
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i = 0; i < num;i--){
				warehouse.remove(i);
			}
			notify();
			System.out.println("消费的产品数是："+num+"；仓库容量的大小是:"+warehouse.size());
		}
	}


	public LinkedList<String> getWarehouse() {
		return warehouse;
	}


	public void setWarehouse(LinkedList<String> warehouse) {
		this.warehouse = warehouse;
	}
	
}
