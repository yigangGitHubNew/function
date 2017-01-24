package com.wuyg.tool.proxy;

public class Client {
	public static void main(String[] args){  
        LogHandler logHandler=new LogHandler();  
        UserManager userManager=(UserManager)logHandler.newProxyInstance(new UserManagerImpl());  
        userManager.add("zhouliming");  
    }  
}
