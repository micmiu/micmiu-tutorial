package com.micmiu.corba.javaidl.server;
/**
 * This class is the implemetation object for your IDL interface.
 *
 * Let the Eclipse complete operations code by choosing 'Add unimplemented methods'.
 */
public class HelloServiceAOMServerImpl extends com.micmiu.corba.javaidl.hello.HelloServicePOA {
	/**
	 * Constructor for HelloServiceAOMServerImpl 
	 */
	public HelloServiceAOMServerImpl() {
	}
	@Override
	public String sayHello(String name) {
		System.out.println("[服务端] 接收的参数 : " + name);
		String ret = "Hi," + name + " welcome to CORBA";
		System.out.println("[服务端] 返回信息 : " + ret);
		return ret;
	}
}
