package com.ond.web.repository;

import com.googlecode.objectify.Key;
import com.ond.web.domain.FlipkartOffer;
import com.ond.web.domain.HeadCarousel;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * Created by vdraj on 9/27/2016.
 */
@Repository
public class HeadCarouselRepository {

    public boolean create(HeadCarousel headCarousel) {
        Key id = ofy().save().entity(headCarousel).now();
        if (id != null) {
            return true;
        }
        return false;
    }

    public boolean createAll(List<HeadCarousel> headCarousels) {
        ofy().save().entities(headCarousels).now();
        return true;
    }

    public List<HeadCarousel> getAll() {
        return ofy().load().type(HeadCarousel.class).list();
    }
}
