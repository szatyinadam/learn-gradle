package com.adam.gradle;

class Greeter {
    private String greeting;

    Greeter() {
    }

    Greeter(String greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return this.greeting != null ? this.greeting : "Haydeehoow";
    }
}