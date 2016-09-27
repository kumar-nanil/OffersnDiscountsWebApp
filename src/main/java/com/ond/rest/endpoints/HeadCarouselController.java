package com.ond.rest.endpoints;

import com.ond.web.domain.Customer;
import com.ond.web.domain.HeadCarousel;
import com.ond.web.repository.HeadCarouselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdraj on 9/27/2016.
 */
@Controller
@RequestMapping(value = "/headCarousel")
public class HeadCarouselController {

    @Autowired
    private HeadCarouselRepository headCarouselRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<HeadCarousel> getHeadCarousel() {
        return headCarouselRepository.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String updateHeadCarousel(@RequestBody List<HeadCarousel> headCarousel) {
        headCarouselRepository.createAll(headCarousel);
        return "Thank You for Signing Up";
    }

}
