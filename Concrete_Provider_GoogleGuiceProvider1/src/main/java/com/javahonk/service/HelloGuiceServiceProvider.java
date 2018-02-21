package com.javahonk.service;

import com.google.inject.Provider;

/**
 * Created by Java Honk on 4/20/2015.
 */
public class HelloGuiceServiceProvider implements Provider<HelloGuiceConcreteClass>{
	
	public HelloGuiceConcreteClass get() {
		HelloGuiceConcreteClass helloGuiceConcreteClass = new HelloGuiceConcreteClass();
        return helloGuiceConcreteClass;
	}
}
