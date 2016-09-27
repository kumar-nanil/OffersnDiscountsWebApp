package com.ond.rest.endpoints;

import com.ond.web.domain.Customer;
import com.ond.web.domain.FlipkartOffer;
import com.ond.web.domain.FlipkartOffers;
import com.ond.web.repository.CustomerRepository;
import com.ond.web.services.OffersnDiscountsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by vdraj on 9/3/2016.
 */
@Controller
public class OffersnDiscountsController {

    private final static Logger LOGGER = Logger.getLogger(OffersnDiscountsController.class);
    @Autowired
    private OffersnDiscountsService offersnDiscountsService;
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/signup/{emailId}", method = RequestMethod.POST)
    @ResponseBody
    public String signUp(@PathVariable String emailId) {
        LOGGER.info("Sign up for customer with email id : " + emailId);
        Customer newCustomer = new Customer(emailId);
        customerRepository.create(newCustomer);
        return "Thank You for Signing Up";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    @ResponseBody
    public String signedUpCustomers() {
        LOGGER.info("Returning list of customers");
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            System.out.println("Customer : " + customer.toString());
        }
        return "Thank You for Signing Up";
    }

    @RequestMapping(value = "/flipkartJob", method = RequestMethod.GET)
    @ResponseBody
    public String saveFlipkartOffers() {
        LOGGER.info("Todays Deals");
        offersnDiscountsService.saveFlipkartOffers();
        return "SUCCESS";
    }

    @RequestMapping(value = "/flipkartdod", method = RequestMethod.GET)
    @ResponseBody
    public List<FlipkartOffer> flipkartOffers() {
        LOGGER.info("Todays Deals");
        return offersnDiscountsService.allFlipkartOffers();
    }

    @RequestMapping(value = "/dealsoftheday/{category}", method = RequestMethod.GET)
    @ResponseBody
    public String dealsOftheDay(@PathVariable String category) {
        LOGGER.info("Returning Todays Offers for Category " + category);
//        offersnDiscountsService.
        return "Thank You for Signing Up";
    }

}
