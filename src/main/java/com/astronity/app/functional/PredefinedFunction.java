package com.astronity.app.functional;

import java.util.function.*;

public class PredefinedFunction {
    static String toUpper(String str)
    {
        return str.toUpperCase();
    }
    static Integer add(Integer x, Integer y)
    {
        return x+y;
    }
    static void display(String message)
    {
        System.out.println("Display "+message);
    }
    static Integer getData()
    {
        return 100;
    }
    static Integer len(String str)
    {
        return str.length();
    }
    static Boolean isEven(Integer x)
    {
        return x%2==0;
    }

    public  static void main(String[] args)
    {
        UnaryOperator<String> unOp = PredefinedFunction::toUpper;
        System.out.println("unOp "+unOp.apply("hello"));

        UnaryOperator<Integer> unOp2 = x -> x*x;
        System.out.println("unOp2 " + unOp2.apply(3));

        BinaryOperator<Integer> binOp = (x, y) -> x+y;
        System.out.println("binOp " + binOp.apply(3, 4));

        BinaryOperator<Integer> binOp2 = PredefinedFunction::add;
        System.out.println("binOp2 " + binOp2.apply(3, 4));

        Consumer<String> consumer = PredefinedFunction::display;
        consumer.accept("hello");

        Supplier<Integer> supplier = PredefinedFunction::getData;
        System.out.println("supplier "+supplier.get());

        Function<String, Integer> function = PredefinedFunction::len;
        System.out.println("function "+function.apply("hello"));

        Predicate<Integer> predicate = PredefinedFunction::isEven;
        System.out.println("predicate "+predicate.test(0));

    }
}
