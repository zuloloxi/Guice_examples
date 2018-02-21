package com.javahonk.service;

import com.google.inject.Provider;

/**
 * Created by Java Honk on 4/19/2015.
 */
public class HelloGuiceServiceProvider implements Provider<HelloGuiceService>{
	
	public HelloGuiceService get() {
		HelloGuiceService helloGuiceService = new HelloGuiceServiceImpl();
        return helloGuiceService;
	}
	
}
