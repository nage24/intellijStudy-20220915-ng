package com.intellij;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .username("junil")
                .password("1234")
                .name("김준일")
                .email("skjil1218@kakao.com")
                .build();

        System.out.println(user);

        UserService userService = new UserServiceImpl();
        userService.insert(user);

        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        String json = gson.toJson(user);
        System.out.println(json);

    }
}