package com.wuyg.tool.collection;
/**
 * 模拟map
 * @author wuyg15871
 *
 */
public class MapImitate {
	MapArray[] arrays = new MapArray[99];
	int size;
	
	public void put(Object key,Object value){
		MapArray array = new MapArray(key, value);
		for(int i = 0; i < size; i++){
			if(arrays[i] != null){
				if(arrays[i].getKey().equals(key)){
					arrays[i].setValue(value);
				}
			}else{
				arrays[i].setKey(key);
				arrays[i].setValue(value);
			}
		}
		arrays[size++] = array;
	}
	
	public Object get(Object key){
		Object obj =null;
		for(int i = 0; i < size; i++){
			if(arrays[i] != null ){
				if(arrays[i].getKey().equals(key)){
					obj =  arrays[i].getValue();
				}
			}
		}
		return obj;
	}
	
	public boolean contains(Object key){
		boolean falg = false;
		for(int i = 0; i < size; i++){
			if(arrays[i] != null){
				if(arrays[i].getKey().equals(key)){
					falg = true;
				}
			}
		}
		return falg;
	}
}
