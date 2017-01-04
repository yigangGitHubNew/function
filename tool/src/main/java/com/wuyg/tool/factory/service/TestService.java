package com.wuyg.tool.factory.service;

import com.wuyg.tool.factory.bean.SpecialMtWhitelistDto;


/**
 * 该接口单纯应用于测试抽象工厂模式
 * 
 * @author zhoulm18864
 * @version $Id: TestService.java, v 0.1 2017年1月4日 上午10:39:44 zhoulm18864 Exp $
 */
public interface TestService {

	/**
	 * 单纯测试方法
	 * 
	 * @param args
	 * @return
	 */
	public SpecialMtWhitelistDto test(Long mtWhitelistId); 
}
