package com.wuyg.tool.collection;

import java.util.Arrays;

/**
 * 模拟list的相关方法
 * @author wuyg15871
 *
 */
public class ListImitate {
	private ListEntity[] entitys = new ListEntity[4];
	
	int size;
	
	public void add(Object value){
		ListEntity entity = new ListEntity(value);
		entitys[size] = entity;
		int a = entitys.length/2;
		if(size > a){
			int newNum = entitys.length*3;
			entitys = Arrays.copyOf(entitys, newNum);
		}
		size++;
	}
	
	public Object get(int i){
		return entitys[i].getValue();
	}
}
