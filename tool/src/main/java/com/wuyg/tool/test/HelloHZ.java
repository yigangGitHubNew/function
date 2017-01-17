package com.wuyg.tool.test;

import java.util.Calendar;

/**
 * 简单的测试类
 * @author wuyg15871
 *
 */
public class HelloHZ {
	
	private String toCtract;
	
	public static void main(String[] args) {
		/*System.out.println("Hello HangZhou");
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		"".equals("asdf");*/
		
		/*BigDecimal big = new BigDecimal(200.67);
		System.out.println(big.intValue());*/
		
		/*if(true && true && false && false && true){
			System.out.println("123213");
		}else{
			System.out.println("222222222");
		}*/
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int _year = Integer.valueOf("20070509".substring(0, 4));
		int _month = Integer.valueOf("20070509".substring(5,7));
		int yearResult = year - _year;
		int monthResult = month - _month;
		if(yearResult != 0){
			if(monthResult < 6){
				System.out.println(yearResult);
			}
		}
		System.out.println("yearResult:"+yearResult);
		System.out.println("monthResult:"+monthResult);
		
		
	}

	public String getToCtract() {
		return toCtract;
	}

	public void setToCtract(String toCtract) {
		this.toCtract = toCtract;
	}
}
