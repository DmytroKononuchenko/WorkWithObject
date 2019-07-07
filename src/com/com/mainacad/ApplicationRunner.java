package com.com.mainacad;

import com.com.mainacad.model.*;
import com.com.mainacad.service.CartServise;
import com.com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    private static final String PROJECT_DIR_PATH = System.getProperty("user.dir");

    public static void main(String[] args) {

        Date birthDay = UserGenerationService.getDate(1982, 7, 22);

        User user1 = new User("konuk12345", "123456", "Alex", "Ignatenko", birthDay, Gender.MALE);


        Item item = new Item("Item Name", "XX60", 25.80);

        Order order = new Order(item, 15);

        Cart cart = new Cart(user1, order, new Date().getTime());

        System.out.println(CartServise.getTotalSum(cart));

        // System.out.println(25.80 * 15);


    }
}