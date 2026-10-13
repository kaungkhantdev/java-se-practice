package com.astronity.app;

class Data {
    int value;

    Data(int value) {
        this.value = value;
    }

    Data() {}
}

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("a==b "+(a == b));
        System.out.println("a== 10.0 "+(a == 10.0));

        Data d1 = new Data();
        d1.value = 100;
        Data d2 = new Data();
        d2.value = 100;
        System.out.println("d1==d2: "+(d1==d2));
        System.out.println("d1.value==d2.value: "+(d1.value==d2.value));

        Data d3 = d2;
        System.out.println("d3== d2 "+(d3==d2));

        float data = 0.0f/0;
        System.out.println("data== data "+(data==data));
        System.out.println("data != data "+(data!=data));
        System.out.println("isNaN  "+Float.isNaN(data));

    }
}
