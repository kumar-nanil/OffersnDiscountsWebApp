package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import javax.annotation.Generated;

/**
 * Created by vdraj on 9/30/2016.
 */
@Entity
public class CategoryOffer {

    @Id
    @Generated(value = "id")
    private Long id;
    @Index
    private String category;

    private Offer[] offer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public Offer[] getOffer()
    {
        return offer;
    }

    public void setOffer(Offer[] offer)
    {
        this.offer = offer;
    }
}
