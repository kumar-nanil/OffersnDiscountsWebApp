package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import javax.annotation.Generated;

/**
 * Created by vdraj on 9/30/2016.
 */
@Entity
public class Offer {

    @Id
    @Generated(value = "id")
    private Long id;
    @Index
    private String category;

    private String title;

    private String description;

    private String imageSrc;

    private String linkUrl;

    private String imageAlt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImageAlt() {
        return imageAlt;
    }

    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Offer{");
        sb.append("id=").append(id);
        sb.append(", category='").append(category).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", imageSrc='").append(imageSrc).append('\'');
        sb.append(", linkUrl='").append(linkUrl).append('\'');
        sb.append(", imageAlt='").append(imageAlt).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
