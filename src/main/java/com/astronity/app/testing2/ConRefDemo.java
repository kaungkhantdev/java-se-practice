package com.astronity.app.testing2;

class Human
{
    public Human()
    {
        System.out.println("Human constructor");
    }
}
class Teacher extends Human
{
    public Teacher()
    {
        System.out.println("Teacher constructor");
    }
}

interface Factory
{
    Human create();
}
public class ConRefDemo {
    public static void main(String[] args)
    {
        Factory human = Human::new;
        human.create();

        human = Teacher::new;
        human.create();

    }
}
