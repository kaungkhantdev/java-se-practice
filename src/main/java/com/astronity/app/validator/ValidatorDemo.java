package com.astronity.app.validator;

public class ValidatorDemo {
    public static void main(String[] args) {
        Human human = new Human("", "yg");

        Validator validator = new Validator();
        validator.validate(human);
    }
}
