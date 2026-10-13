package com.astronity.app.account;

public class InvalidDebitOperation extends Exception {
    public InvalidDebitOperation(String message) {
        super(message);
    }
}
