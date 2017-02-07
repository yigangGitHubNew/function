package com.wuyg.tool.collection;

public class TestListImitate {
	public static void main(String[] args) {
		ListImitate list = new ListImitate();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		for(int i = 0; i < list.size;i++){
			System.out.println(list.get(i));
		}
	}
}
