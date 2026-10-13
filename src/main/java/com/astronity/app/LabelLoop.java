package com.astronity.app;

public class LabelLoop {
    public static void main(String[] args) {
        outer:for (int i = 1; i < 10; i++) {
            System.out.println("First Loop: " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println("Second Loop: " + j);
                if (j == 5) break outer;
            }
        }

        System.out.println("Loop End.");
    }
}
