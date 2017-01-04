package com.wuyg.tool.factory.manager;

import java.lang.reflect.Method;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.wuyg.tool.bean.ManagerFactory;

/**
 * 工厂创建方法
 * 
 * @author zhoulm18864
 * @version $Id: ManagerFactoryImpl.java, v 0.1 2017年1月4日 上午10:54:47 zhoulm18864
 *          Exp $
 */
public class ManagerFactoryImpl implements ManagerFactory {
	
//	private Logger logger = LoggerFactory.getLogger(ManagerFactoryImpl.class);

	private MtWhitelistManager mtWhitelistManager;
	
	private ChannelAppManager channelAppManager;

	@SuppressWarnings("unchecked")
	@Override
	public <T> T createManager(Class<T> clazz, ManagerFactory managerFactory) {
		Class<?> tempclazz = managerFactory.getClass();
		Method[] methods = tempclazz.getMethods();
		for (Method method : methods) {
			Class<?> returnTypeTClazz = method.getReturnType();
			if (returnTypeTClazz.equals(clazz)) {
				try {
					return (T) method.invoke(managerFactory);
				} catch (Exception e) {
//					logger.error("执行反射方法出错了", e);
				}
			}
		}
		return null;
	}

	/********************************************** 我是快乐的分割线 **********************************************/

	public MtWhitelistManager getMtWhitelistManager() {
		return mtWhitelistManager;
	}

	public void setMtWhitelistManager(MtWhitelistManager mtWhitelistManager) {
		this.mtWhitelistManager = mtWhitelistManager;
	}

	public ChannelAppManager getChannelAppManager() {
		return channelAppManager;
	}

	public void setChannelAppManager(ChannelAppManager channelAppManager) {
		this.channelAppManager = channelAppManager;
	}

}
