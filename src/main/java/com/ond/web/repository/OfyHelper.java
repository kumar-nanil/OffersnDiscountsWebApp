package com.ond.web.repository;

import com.googlecode.objectify.ObjectifyService;
import com.ond.web.domain.*;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OfyHelper implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        // This will be invoked as part of a warmup request, or the first user request if no warmup
        // request.
        ObjectifyService.register(FlipkartOffer.class);
        ObjectifyService.register(CategoryOffer.class);
        ObjectifyService.register(HeadCarousel.class);
        ObjectifyService.register(Customer.class);
        ObjectifyService.register(Offer.class);
    }

    public void contextDestroyed(ServletContextEvent event) {
        // App Engine does not currently invoke this method.
    }
}