package com.javahonk.service;

/**
 * Created by Java Honk on 4/19/2015.
 */
public class HelloGuiceServiceImpl implements HelloGuiceService {

	public String serviceMethod(String msg) {
		return "Google Guice "+ msg;
	}
   
}
