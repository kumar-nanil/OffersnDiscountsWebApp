package com.ond.web.services;

import com.ond.web.domain.CategoryOffer;

import java.util.List;

/**
 * Created by vdraj on 9/30/2016.
 */
public interface MainPageService {

    void updateCategoryOffers(List<CategoryOffer> categoryOfferList);

    List<CategoryOffer> getAll();
}
