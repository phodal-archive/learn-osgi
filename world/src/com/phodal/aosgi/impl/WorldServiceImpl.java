package com.phodal.aosgi.impl;

import com.phodal.aosgi.WorldService;

public class WorldServiceImpl implements WorldService {
    @Override
    public String sayHello() {
        System.out.println("Inside WorldService.sayHello()");
        return "Say Hello";
    }
}
