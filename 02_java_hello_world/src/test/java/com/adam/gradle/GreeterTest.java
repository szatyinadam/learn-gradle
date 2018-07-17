package com.adam.gradle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class GreeterTest {

    @Test
    @DisplayName("Greeter should return with the usual greeting")
    public void testGreetingWithEmptyConstructor() {
        Greeter greeter = new Greeter();
        assertEquals("Haydeehoow", greeter.greet());
    }

    @Test
    @DisplayName("Greeter should return with the given greeting")
    public void testGreetingWithMessage() {
        Greeter greeter = new Greeter("Hi");
        assertEquals("Hi", greeter.greet());
    }
}