package com.vijay.didemo.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Hello - Primary Greeting Service";
    }
}
