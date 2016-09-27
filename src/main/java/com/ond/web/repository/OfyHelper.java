package com.ond.web.repository;

import com.googlecode.objectify.ObjectifyService;
import com.ond.web.domain.Customer;
import com.ond.web.domain.FlipkartOffer;
import com.ond.web.domain.FlipkartOffers;
import com.ond.web.domain.HeadCarousel;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OfyHelper implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        // This will be invoked as part of a warmup request, or the first user request if no warmup
        // request.
        ObjectifyService.register(Customer.class);
        ObjectifyService.register(FlipkartOffer.class);
        ObjectifyService.register(HeadCarousel.class);
    }

    public void contextDestroyed(ServletContextEvent event) {
        // App Engine does not currently invoke this method.
    }
}