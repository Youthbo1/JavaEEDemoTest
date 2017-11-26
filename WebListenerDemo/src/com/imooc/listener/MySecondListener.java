package com.imooc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MySecondListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("second listener context destroyed... ...");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("second listener context initialized... ...");

	}

}
