package com.com.mainacad.service;

        import com.com.mainacad.model.Cart;

public class CartServise {
    public static double getTotalSum(Cart cart) {
        return cart.getOrder().getAmaunt() * cart.getOrder().getItem().getPrice();
    }
}
