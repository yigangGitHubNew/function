package com.wuyg.tool.test;



/**
 * 简单的测试类
 * @author wuyg15871
 *
 */
public class HelloHZ {
	
	/*private String toCtract;*/
	
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
		
		/*Calendar cal = Calendar.getInstance();
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
		System.out.println("monthResult:"+monthResult);*/
		/*Integer num1 = 2;
		if(num1.equals(2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}*/
		/*mulite(9);*/
		
		/**生成六位随机数*//*
		String[] strs = {"0","1","2","3","4","5","6","7","8","9"};
		String[] chars = {"A","B","C","D","E","F","G","H","I","G"};
		StringBuffer numbu = new StringBuffer();
		StringBuffer charbu = new StringBuffer();
		for(int i = 0 ; i < 3; i++){
			Random rd = new Random();
			int num = rd.nextInt(10);
			String _str = strs[num];
			String str = chars[num];
			charbu.append(_str);
			numbu.append(str);
		}
		System.out.println(numbu.append(charbu));
		System.out.println(charbu);*/
	}
	
	/**
	 * 9*9的乘法列表
	 * @param i
	 */
	/*public static void mulite(int i){
		if(i == 1){
			System.out.println("1*1=1;");
		}else{
			int m = i -1;
			mulite(m);
			for(int j = 1; j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+";");
			}
			System.out.println();
		}
	}*/

	/*public String getToCtract() {
		return toCtract;
	}

	public void setToCtract(String toCtract) {
		this.toCtract = toCtract;
	}*/
}
