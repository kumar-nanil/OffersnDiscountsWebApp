package com.ond.rest.endpoints;

import com.ond.web.domain.CategoryOffer;
import com.ond.web.domain.HeadCarousel;
import com.ond.web.domain.Offer;
import com.ond.web.repository.HeadCarouselRepository;
import com.ond.web.services.MainPageService;
import com.ond.web.services.MainPageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by vdraj on 9/30/2016.
 */
@Controller
@RequestMapping(value = "/mainoffers")
public class MainPageOffersController {

    @Autowired
    private MainPageService mainPageService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<CategoryOffer> getCategoryOffers() {
        return mainPageService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String upsertCategoryOffers(@RequestBody List<CategoryOffer> categoryOfferList) {
        mainPageService.updateCategoryOffers(categoryOfferList);
        return "Thank You for Signing Up";
    }


}
