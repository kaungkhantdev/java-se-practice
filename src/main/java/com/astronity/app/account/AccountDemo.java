package com.astronity.app.account;

public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account(100);
        System.out.println("Before Balance "+acc.getBalance());

        try {
            acc.credit(200);
            acc.debit(-400);

        } catch (InvalidCreditOperation|InvalidDebitOperation ex) {
            System.out.println("Excep "+ex.getMessage());
        }

        System.out.println("Balance "+acc.getBalance());

    }
}
