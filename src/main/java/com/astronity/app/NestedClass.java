package com.astronity.app;

class Outer {
    int outerX = 10;

    void outerMethod(){
        Inner inner = new Inner();
        inner.innerMethod();
    }

    class Inner {
        int innerX = 10;
        void innerMethod(){
            System.out.println("Inner method ");
            System.out.println("Innerx "+this.innerX);
            System.out.println("OuterX "+outerX);
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
