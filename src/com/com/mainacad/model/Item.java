package com.com.mainacad.model;

public class Item {
    private String name;
    private String article;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item() {
    }

    public Item(String name, String article, double price) {
        this.name = name;
        this.article = article;
        this.price = price;
    }
}

