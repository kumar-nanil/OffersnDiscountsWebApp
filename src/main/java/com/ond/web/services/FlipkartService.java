package com.ond.web.services;

import com.ond.web.domain.FlipkartOffer;
import com.ond.web.domain.FlipkartOffers;
import com.ond.web.domain.TodaysOffers;

import java.util.List;

/**
 * Created by vdraj on 9/13/2016.
 */
public interface FlipkartService {

    void saveAllOffersFlipkart();

    List<FlipkartOffer> allFlipkartOffers();
}