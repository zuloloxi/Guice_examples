package com.javahonk;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.javahonk.module.HelloGuiceModule;
import com.javahonk.service.HelloGuiceService;

/**
 * Created by Java Honk on 4/9/2015.
 */
public class HelloWorldGuiceMainClass {

    @Inject
    HelloGuiceService helloGuiceService;

    public static void main(String[] args) {
        
    	HelloWorldGuiceMainClass helloWorldGuiceMainClass = new HelloWorldGuiceMainClass();

        Module module = new HelloGuiceModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(helloWorldGuiceMainClass);

        helloWorldGuiceMainClass.helloWorldGuice();
    }

    private void helloWorldGuice() {
        String testStr = helloGuiceService.serviceMethod("Hello World!");
        System.out.println(testStr);
    }
}
