package com.ond.web.domain;

/**
 * Created by vdraj on 9/13/2016.
 */
public class ImageUrls
{
    private String resolutionType;

    private String url;

    public String getResolutionType ()
    {
        return resolutionType;
    }

    public void setResolutionType (String resolutionType)
    {
        this.resolutionType = resolutionType;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [resolutionType = "+resolutionType+", url = "+url+"]";
    }
}