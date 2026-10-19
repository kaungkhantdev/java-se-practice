package com.astronity.app;

import java.util.Currency;
import java.util.Optional;

public class OptionalDemo {
    static Optional<Integer> getData(int n)
    {
        if (n == 0)
        {
            return Optional.empty();
        }
        else
        {
            return Optional.of(n);
        }
    }
    public static void main(String[] args) {
        // Integer data = null;
        Integer data = 10;

        Optional.ofNullable(data)
                .map(i -> {
                    System.out.println("Inc");
                    return i + 1;
                })
                .flatMap(OptionalDemo::getData)
                .ifPresent(System.out::println);

        getData(10)
                .map( x -> {
                    System.out.println("x");
                    return x + 20;
                })
                .ifPresentOrElse(
                        x->System.out.println("Present "+x),
                        ()-> System.out.println("Nothing"));;
    }
}
