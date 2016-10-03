package com.ond.web.services;

import com.ond.web.domain.CategoryOffer;
import com.ond.web.repository.CategoryOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vdraj on 9/30/2016.
 */
@Service
public class MainPageServiceImpl implements MainPageService {

    @Autowired
    private CategoryOfferRepository categoryOfferRepository;

    @Override
    public void updateCategoryOffers(List<CategoryOffer> categoryOfferList) {
        categoryOfferRepository.createAll(categoryOfferList);
    }

    @Override
    public List<CategoryOffer> getAll() {
        return categoryOfferRepository.getAll();
    }
}
