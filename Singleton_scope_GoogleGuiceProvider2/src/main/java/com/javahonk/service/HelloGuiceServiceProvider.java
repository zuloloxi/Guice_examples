package com.javahonk.service;

import com.google.inject.Provider;

/**
 * Created by Java Honk on 4/20/2015.
 */
public class HelloGuiceServiceProvider implements Provider<String>{
	
	public String get() {
		System.out.println("HelloGuiceServiceProvider.get() being called");
        return "Singleton scope test";
	}
}
