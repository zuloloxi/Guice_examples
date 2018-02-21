package com.javahonk.service;

/**
 * Created by Java Honk on 4/9/2015.
 */
public class HelloGuiceServiceImpl implements HelloGuiceService {

	@Override
	public String serviceMethod(String msg) {
		return "Google Guice "+ msg;
	}

   
}
