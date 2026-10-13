package com.astronity.app.validator;

public class Human {
    @NullOrEmpty(message = "Name should not be null or empty.")
    String name;

    String address;

    Human(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
