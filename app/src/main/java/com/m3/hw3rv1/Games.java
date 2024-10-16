package com.m3.hw3rv1;

public class Games {
    private String name;
    private String image;
    private String price;

    public Games(String image,String name,String price) {
        this.image = image;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setDisc(String disc) {
        this.price = price;
    }
}