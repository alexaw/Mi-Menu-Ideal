package com.example.alexandraw.mimenuideal.models;

/**
 * Created by JUAN DAVID YP on 25/10/2015.
 */
public class Category {
    String category, imgUrl;
    float start;

    public Category() {
    }

    public Category(String category, String imgUrl, float start) {
        this.category = category;
        this.imgUrl = imgUrl;
        this.start = start;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }
}
