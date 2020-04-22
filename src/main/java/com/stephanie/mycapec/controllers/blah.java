package com.stephanie.mycapec.controllers;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class blah implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {}

    public void contextDestroyed(ServletContextEvent sce) {
        //PersistenceManager.closeEntityMangerFactory();
    }
}