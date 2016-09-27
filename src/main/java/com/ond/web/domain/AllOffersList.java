package com.ond.web.domain;

import com.googlecode.objectify.annotation.Index;

/**
 * Created by vdraj on 9/13/2016.
 */
public class AllOffersList
{
    private String startTime;
    @Index
    private String category;

    private String title;

    private String description;

    private ImageUrls[] imageUrls;

    private String endTime;

    private String url;

    private String availability;

    public String getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (String startTime)
    {
        this.startTime = startTime;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public ImageUrls[] getImageUrls ()
    {
        return imageUrls;
    }

    public void setImageUrls (ImageUrls[] imageUrls)
    {
        this.imageUrls = imageUrls;
    }

    public String getEndTime ()
    {
        return endTime;
    }

    public void setEndTime (String endTime)
    {
        this.endTime = endTime;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getAvailability ()
    {
        return availability;
    }

    public void setAvailability (String availability)
    {
        this.availability = availability;
    }

    @Override
    public String toString()
    {
        return "[startTime = "+startTime+", category = "+category+", title = "+title+", description = "+description+", imageUrls = "+imageUrls+", endTime = "+endTime+", url = "+url+", availability = "+availability+"]";
    }
}