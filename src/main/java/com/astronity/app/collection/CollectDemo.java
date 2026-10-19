package com.astronity.app.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = list
                                .stream()
                                .map( x -> x * 2)
                                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
