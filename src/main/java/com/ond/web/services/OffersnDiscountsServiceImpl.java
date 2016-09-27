package com.ond.web.services;

import com.ond.web.domain.FlipkartOffer;
import com.ond.web.domain.FlipkartOffers;
import com.ond.web.domain.TodaysOffers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vdraj on 9/13/2016.
 */
@Service
public class OffersnDiscountsServiceImpl implements OffersnDiscountsService {

    @Autowired
    private FlipkartService flipkartService;

    @Override
    public void saveFlipkartOffers() {
        flipkartService.saveAllOffersFlipkart();
    }

    @Override
    public List<FlipkartOffer> allFlipkartOffers() {
        return flipkartService.allFlipkartOffers();
    }

//    @Override
//    public FlipkartOffers fromFlipkart(String category) {
//        return flipkartService.allOffersList(category);
//    }

}
