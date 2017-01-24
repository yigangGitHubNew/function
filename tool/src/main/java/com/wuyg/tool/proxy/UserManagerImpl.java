package com.wuyg.tool.proxy;

public class UserManagerImpl implements UserManager {

	public void add(String username) {
		System.out.println("this is add method"+username);
	}

	public void del(String username) {
		System.out.println("this is del method"+username);
	}

}
