package com.astronity.app;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

class Item {
    String name;
    Float price;
    int quantity;

    public Item(String name, Float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        List<Item> items = new ArrayList<>();
        items.add(new Item("Jack", 100.0f, 1));
        items.add(new Item("Jill", 120.0f, 2));
        items.add(new Item("Peter", 30.0f, 3));
        items.add(new Item("Mike", 40.0f, 4));

        for(Item item : items) {
            formatter.format("%-40s %12.2f %5d %n", item.name, item.price, item.quantity);
//            formatter.format(item.name, item.price, item.quantity);
        }

        System.out.println(formatter);
        formatter.close();
    }
}
