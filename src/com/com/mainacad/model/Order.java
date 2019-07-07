package com.com.mainacad.model;

public class Order {
    private Item item;
    private Integer amaunt;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmaunt() {
        return amaunt;
    }

    public void setAmaunt(Integer amaunt) {
        this.amaunt = amaunt;
    }

    public Order(Item item) {
    }

    public Order(Item item, Integer amaunt) {
        this.item = item;
        this.amaunt = amaunt;
    }
}


