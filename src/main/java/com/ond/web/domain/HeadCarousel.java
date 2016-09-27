package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import javax.annotation.Generated;

/**
 * Created by vdraj on 9/27/2016.
 */
@Entity
public class HeadCarousel {

    @Id
    @Generated(value = "id")
    private Long id;

    private String imageSrc;

    private String imageAlt;

    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getImageAlt() {
        return imageAlt;
    }

    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HeadCarousel{");
        sb.append("id=").append(id);
        sb.append(", imageSrc='").append(imageSrc).append('\'');
        sb.append(", imageAlt='").append(imageAlt).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
