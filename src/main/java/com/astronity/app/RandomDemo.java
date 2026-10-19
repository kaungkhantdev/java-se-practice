package com.astronity.app;

import java.util.Random;
import java.util.UUID;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            //System.out.println("Next "+(1+random.nextInt(10)));
            String uuidString = uuid.toString();

            System.out.println("UUID Object: " + uuid);
            System.out.println("UUID String: " + uuidString);
        }
    }
}
