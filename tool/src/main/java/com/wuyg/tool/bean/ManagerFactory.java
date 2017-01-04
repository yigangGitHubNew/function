package com.wuyg.tool.bean;

/**
 * 组件层抽象工厂接口
 * 
 * @author zhoulm18864
 * @version $Id: ManagerFactory.java, v 0.1 2017年1月4日 上午10:47:59 zhoulm18864 Exp $
 */
public interface ManagerFactory {

	/**
	 * 创建manager方法
	 * 
	 * @param clazz
	 * @return
	 */
	public <T> T createManager(Class<T> clazz, ManagerFactory managerFactory);
}
