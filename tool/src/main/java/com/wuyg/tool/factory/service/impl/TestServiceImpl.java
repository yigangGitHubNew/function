package com.wuyg.tool.factory.service.impl;

import com.wuyg.tool.factory.ManagerFactory;
import com.wuyg.tool.factory.bean.SpecialMtWhitelistDto;
//import com.wuyg.tool.factory.manager.ChannelAppManager;
import com.wuyg.tool.factory.manager.MtWhitelistManager;
import com.wuyg.tool.factory.service.TestService;


public class TestServiceImpl implements TestService {

	private ManagerFactory managerFactory;
	
	@Override
	public SpecialMtWhitelistDto test(Long mtWhitelistId) {
		MtWhitelistManager mtWhitelistManager = managerFactory.createManager(MtWhitelistManager.class, managerFactory);
//		ChannelAppManager ChannelAppManager = managerFactory.createManager(ChannelAppManager.class, managerFactory);
		SpecialMtWhitelistDto result = mtWhitelistManager.queryByPrimaryKey(mtWhitelistId);
		return result;
	}

	/****************************************我是快乐的分割线****************************************/
	
	public ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public void setManagerFactory(ManagerFactory managerFactory) {
		this.managerFactory = managerFactory;
	}

}
