package com.ond.web.repository;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Result;
import com.ond.web.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.googlecode.objectify.ObjectifyService.ofy;
/**
 * Created by vdraj on 9/13/2016.
 */
@Repository
public class CustomerRepository {

    public boolean create(Customer customer) {
        Key customerId = ofy().save().entity(customer).now();
        if (customerId != null) {
            return true;
        }
        return false;
    }

    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        List<Customer> keys = ofy().load().type(Customer.class).list();
        return keys;
    }
}
