/*
 * Created by IntelliJ IDEA.
 * User: Java Honk
 * Date: 4/9/2015
 * Time: 9:26 PM
 */
package com.javahonk.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.javahonk.service.HelloGuiceService;
import com.javahonk.service.HelloGuiceServiceProvider;

/**
 * Created by Java Honk on 4/19/2015.
 */
public class HelloGuiceModule extends AbstractModule {

	protected void configure() {
		bind(HelloGuiceService.class).toProvider(HelloGuiceServiceProvider.class).in(Singleton.class);

	}
}
