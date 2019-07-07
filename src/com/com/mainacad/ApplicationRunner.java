package com.com.mainacad;

import com.com.mainacad.model.Gender;
import com.com.mainacad.model.User;
import com.com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {

        Date birthDay = UserGenerationService.getDate(1982, 7, 22);

        User user1 = new User("konuk12345", "123456", "Alex", "Ignatenko", birthDay, Gender.MALE);
        User user2 = new User("konuk", "123456", "Alex", "Ignatenko", birthDay, Gender.MALE);

        System.out.println(user1);
        System.out.println(user1.equals(user2));
    }
}
