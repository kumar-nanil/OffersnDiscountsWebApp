package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import javax.annotation.Generated;

/**
 * Created by vdraj on 9/27/2016.
 */
@Entity
public class HomePageOffer {

    @Id
    @Generated(value = "id")
    private Long id;

    private String CategoryDisplayName;

    private String imageUrls;

    private String offerTitle;
    private String offerDescription;

}
