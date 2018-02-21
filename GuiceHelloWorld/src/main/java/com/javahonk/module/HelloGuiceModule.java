/*
 * Created by IntelliJ IDEA.
 * User: BRIJ
 * Date: 4/9/2015
 * Time: 9:26 PM
 */
package com.javahonk.module;

import com.google.inject.AbstractModule;
import com.javahonk.service.HelloGuiceService;
import com.javahonk.service.HelloGuiceServiceImpl;

public class HelloGuiceModule extends AbstractModule {

	protected void configure() {
		// add configuration logic here
		bind(HelloGuiceService.class).to(HelloGuiceServiceImpl.class);

	}
}
