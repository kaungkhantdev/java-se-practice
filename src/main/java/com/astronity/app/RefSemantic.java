package com.astronity.app;


public class RefSemantic {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a++;

        System.out.println("A "+a);
        System.out.println("B "+b);

        Data obj = new Data(10);
        Data obj2 = obj;
        obj.value ++;

        System.out.println("Obj "+obj.value);
        System.out.println("Obj2 "+obj2.value);

        System.out.println("Obj "+obj);
        System.out.println("Obj2 "+obj2);

        obj2 = new Data(30);
        obj.value ++;
        System.out.println("Obj "+obj.value);
        System.out.println("Obj2 "+obj2.value);
        System.out.println("Obj "+obj);
        System.out.println("Obj2 "+obj2);

    }
}
