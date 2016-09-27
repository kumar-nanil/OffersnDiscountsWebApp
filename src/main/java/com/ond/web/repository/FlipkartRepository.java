package com.ond.web.repository;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Result;
import com.ond.web.domain.Customer;
import com.ond.web.domain.FlipkartOffer;
import com.ond.web.domain.FlipkartOffers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * Created by vdraj on 9/14/2016.
 */
@Repository
public class FlipkartRepository {

    public boolean create(FlipkartOffer flipkartOffer) {
        Key customerId = ofy().save().entity(flipkartOffer).now();
        if (customerId != null) {
            return true;
        }
        return false;
    }

    public boolean createAll(List<FlipkartOffer> flipkartOfferList) {
        ofy().save().entities(flipkartOfferList).now();
        return true;
    }

    public List<FlipkartOffer> getAll() {
        return ofy().load().type(FlipkartOffer.class).list();
    }

}
