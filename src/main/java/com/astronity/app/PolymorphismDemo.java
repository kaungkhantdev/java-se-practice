package com.astronity.app;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void work()
    {
        System.out.println("Person - " +this.name+ " work");
    }
}

class Teacher extends Person {
    String subject;
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void work()
    {
        System.out.println("Teacher " +this.name+ " teach " + this.subject);
    }
}

class Developer extends Person {
    String programming;
    public Developer(String name, String programming) {
        super(name);
        this.programming = programming;
    }

    void work()
    {
        System.out.println("Developer " +this.name+ " expert " + this.programming);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person person = new Person("U Ba");
        person.work();

        person = new Teacher("Mg Mg", "English");
        person.work();

        person = new Developer("Zaw Zaw", "Java");
        person.work();
    }
}
