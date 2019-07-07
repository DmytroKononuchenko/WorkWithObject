package com.com.mainacad.model;

public class Item {
    private double price;
    private String article;
    private String theName;

    public Item(double price, String article, String theName) {
        this.price = price;
        this.article = article;
        this.theName = theName;
    }

    public Item(String, String xxx60, String itemName) {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }


}


