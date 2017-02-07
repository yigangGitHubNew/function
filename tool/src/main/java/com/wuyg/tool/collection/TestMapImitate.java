package com.wuyg.tool.collection;

public class TestMapImitate {
	public static void main(String[] args) {
		MapImitate map = new MapImitate();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		System.out.println(map.get("3"));
		
		MapImitateBetter _map = new MapImitateBetter();
		_map.put("4", "4");
		_map.put("4", "5");
		_map.put("6", "6");
		System.out.println(_map.get("4"));
		System.out.println(_map.get("4"));
		System.out.println(_map.get("6"));
	}
}
