package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Created by vdraj on 9/18/2016.
 */
@Entity
public class FlipkartOffer  {

    @Id
    private Long id;
    private String startTime;
    @Index
    private String category;

    private String title;

    private String description;

    private ImageUrls[] imageUrls;

    private String endTime;

    private String url;

    private String availability;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
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

    public ImageUrls[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ImageUrls[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FlipkartOffer{");
        sb.append("startTime='").append(startTime).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", imageUrls=").append(imageUrls == null ? "null" : Arrays.asList(imageUrls).toString());
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", availability='").append(availability).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
