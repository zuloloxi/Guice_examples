package com.javahonk;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.javahonk.module.HelloGuiceModule;

/**
 * Created by Java Honk on 4/20/2015.
 */
public class ProviderConcreteMainClass {
	
	public static void main(String[] args) {
        
		Injector injector = Guice.createInjector(new HelloGuiceModule());
		
		// "HelloGuiceServiceProvider.get()" will be called only once
		String value1 = injector.getInstance(String.class); // Called HelloGuiceServiceProvider.get() method
		System.out.println(value1);
		String value2 = injector.getInstance(String.class);  // No call to HelloGuiceServiceProvider.get() method
		System.out.println(value2);
		
		// Another way to get provider instance
		Provider<String> providerInstance = injector.getProvider(String.class);
		System.out.println(providerInstance.get());  // No call to HelloGuiceServiceProvider.get() method
		System.out.println(providerInstance.get());  // No call to HelloGuiceServiceProvider.get() method    
    }    
   
}
