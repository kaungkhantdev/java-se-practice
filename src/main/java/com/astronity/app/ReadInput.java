package com.astronity.app;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        String name;
        Integer age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Name "+name + " age "+age);

    }
}
