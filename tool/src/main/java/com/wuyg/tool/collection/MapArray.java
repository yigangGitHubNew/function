package com.wuyg.tool.collection;
/**
 * map的数组
 * @author wuyg15871
 *
 */
public class MapArray {
	private Object key;
	private Object value;
	
	public MapArray(Object key,Object value){
		this.key = key;
		this.value = value;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
