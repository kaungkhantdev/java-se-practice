package com.astronity.app.collection;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Optional<Integer> optional = list.stream().filter(x -> x % 2 == 0).reduce((a,b) -> a+b);
        System.out.println(optional.get());
    }
}
