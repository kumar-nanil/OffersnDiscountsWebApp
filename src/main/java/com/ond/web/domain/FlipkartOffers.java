package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;

/**
 * Created by vdraj on 9/13/2016.
 */
@Entity
public class FlipkartOffers
{
    private AllOffersList[] allOffersList;

    public AllOffersList[] getAllOffersList ()
    {
        return allOffersList;
    }

    public void setAllOffersList (AllOffersList[] allOffersList)
    {
        this.allOffersList = allOffersList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [allOffersList = "+allOffersList+"]";
    }
}