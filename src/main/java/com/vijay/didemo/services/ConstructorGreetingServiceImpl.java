package com.vijay.didemo.services;

import org.springframework.stereotype.*;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{


    @Override
    public String greeting() {
        return "Hi I am constructor greeting service...";
    }
}
