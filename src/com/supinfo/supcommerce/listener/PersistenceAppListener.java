package com.supinfo.supcommerce.listener;

import com.supinfo.supcommerce.utils.PersistenceManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Alexandre Nguyen <alex.nr@hotmail.co.jp>
 */
@WebListener
public class PersistenceAppListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        PersistenceManager.closeEntityManagerFactory();
    }
}
