package com.javahonk;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.javahonk.module.HelloGuiceModule;
import com.javahonk.service.HelloGuiceConcreteClass;

/**
 * Created by Java Honk on 4/20/2015.
 */
public class ProviderConcreteMainClass {
	
	public static void main(String[] args) {
        
    	Injector injector = Guice.createInjector(new HelloGuiceModule());
        HelloGuiceConcreteClass helloGuiceConcreteClass = injector.getInstance(HelloGuiceConcreteClass.class);
        
        String testStr = helloGuiceConcreteClass.serviceMethod("Provider concrete class implemetation!");
        System.out.println(testStr);       
    }    
   
}
