package com.astronity.app.account;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void debit(int amount) throws InvalidDebitOperation
    {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        } else throw new InvalidDebitOperation("Invalid amount or balance for debit "+amount);
    }

    public void credit(int amount) throws InvalidCreditOperation
    {
        if (amount >= 0) {
            balance += amount;
        } else throw new InvalidCreditOperation("Invalid amount for credit "+amount);
    }

    public int getBalance() {
        return balance;
    }
}
