package com.ond.web.repository;

import java.util.List;
import com.googlecode.objectify.Key;
import com.ond.web.domain.CategoryOffer;
import org.springframework.stereotype.Repository;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * Created by vdraj on 9/30/2016.
 */
@Repository
public class CategoryOfferRepository {

    public boolean create(CategoryOffer categoryOffer) {
        Key customerId = ofy().save().entity(categoryOffer).now();
        if (customerId != null) {
            return true;
        }
        return false;
    }

    public boolean createAll(List<CategoryOffer> categoryOfferList) {
        ofy().save().entities(categoryOfferList).now();
        return true;
    }

    public List<CategoryOffer> getAll() {
        return ofy().load().type(CategoryOffer.class).list();
    }
}
