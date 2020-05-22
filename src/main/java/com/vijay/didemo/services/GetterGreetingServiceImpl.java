package com.vijay.didemo.services;

import org.springframework.stereotype.*;

@Service
public class GetterGreetingServiceImpl implements GreetingService {


    @Override
    public String greeting() {
        return "Hi I am getter Greeting service";
    }
}
