package com.vijay.didemo.Controller;

import com.vijay.didemo.services.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testHello(){
        assertEquals(GreetingServiceImpl.GREETING_MESSAGE, propertyInjectedController.sayHello());
    }

}