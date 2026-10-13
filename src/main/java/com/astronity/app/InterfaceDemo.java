package com.astronity.app;

interface Flyable{
    void fly();
}

interface Playable{
    void play();
}

interface FlyableWithEat extends Flyable, Playable
{
    void eat();
}

class Bird implements FlyableWithEat{
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void play() {
        System.out.println("Bird play");
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }
}

class AroPlane implements Flyable {
    @Override
    public void fly() {
        System.out.println("AroPlane fly");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();

        flyable = new AroPlane();
        flyable.fly();
    }
}
