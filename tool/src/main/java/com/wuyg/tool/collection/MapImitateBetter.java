package com.wuyg.tool.collection;

import java.util.LinkedList;

public class MapImitateBetter {
	LinkedList[] lists = new LinkedList[9];
	
	public void put(Object key, Object value){
		MapArray array = new MapArray(key, value);
		int hashCode = key.hashCode()<0 ? -key.hashCode():key.hashCode();
		int linkedSize = lists.length;
		int hashNum = hashCode%linkedSize;
		if(lists[hashNum] == null){
			LinkedList list = new LinkedList();
			list.add(array);
			lists[hashNum] = list;
		}else{
			LinkedList list = lists[hashNum];
			for(int i = 0; i < list.size(); i++){
				MapArray _array = (MapArray) list.get(i);
				if(_array.getKey().equals(key)){
					_array.setValue(value);
				}else{
					_array.setKey(key);
					_array.setValue(value);
				}
			}
			list.add(array);
			lists[hashNum] = list;
		}
	}
	
	public Object get(Object key){
		int hashCode = key.hashCode()<0 ? -key.hashCode():key.hashCode();
		int linkedSize = lists.length;
		int hashNum = hashCode%linkedSize;
		LinkedList list = lists[hashNum];
		for(int i = 0; i<list.size();i++){
			MapArray array = (MapArray) list.get(i);
			if(array.getKey().equals(key)){
				return array.getValue();
			}
			
		}
		return null;
	}
}
