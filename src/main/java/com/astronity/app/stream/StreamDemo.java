package com.astronity.app.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> stream = list.stream().map(x -> x * 2);
        stream.forEach(x->System.out.println("x is "+x));

        list.stream().forEach(System.out::println);
    }
}
