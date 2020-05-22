package com.vijay.didemo.services;

import org.springframework.stereotype.*;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING_MESSAGE = "Hello Guys!!";

    @Override
    public String greeting() {
        return GREETING_MESSAGE;
    }
}
