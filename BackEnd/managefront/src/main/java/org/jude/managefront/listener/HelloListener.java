package org.jude.managefront.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Hello listener");
    }

    public void contextDestroyed(ServletContextEvent event) {

    }
}
