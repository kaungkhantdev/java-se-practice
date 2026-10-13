package com.astronity.app;

public class Factorial {
    int factorial(int n){
        System.out.println("Factorial: " + n);

        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("fact(4) "+fact.factorial(4));
    }
}
