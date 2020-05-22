package com.vijay.didemo.Controller;

import com.vijay.didemo.services.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @BeforeEach
    void setUp() {
        getterInjectedController = new GetterInjectedController();
        getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        assertEquals(GreetingServiceImpl.GREETING_MESSAGE, getterInjectedController.sayHello());
    }
}