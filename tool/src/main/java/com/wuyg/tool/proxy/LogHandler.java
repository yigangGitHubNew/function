package com.wuyg.tool.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {
	
	private Object obj;
	
	
	public Object newProxyInstance(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
       /* for(int i=0;i<args.length;i++){  
            System.out.println(args[i]);  
        }*/  
        Object ret=null;
        try{  
            /*原对象方法调用前处理日志信息*/  
            System.out.println("satrt-->>");  
              
            //调用目标方法  
            ret=method.invoke(obj, args);  
            /*原对象方法调用后处理日志信息*/  
            System.out.println("success-->>");  
        }catch(Exception e){  
            e.printStackTrace();  
            System.out.println("error-->>");  
            throw e;  
        }  
        return ret; 
	}
	
	

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}
