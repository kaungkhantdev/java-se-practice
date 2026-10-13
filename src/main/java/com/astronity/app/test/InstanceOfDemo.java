package com.astronity.app.test;

import static java.lang.System.out;

class Human
{
}
class Student extends Human
{
}
class Teacher extends Human
{
}
public class InstanceOfDemo {
    public static void main(String[] args) {
        Human h = new Student();

        out.println("h instanceof Human "+ (h instanceof Human));
        out.println("h instanceof Student "+ (h instanceof Student));
        out.println("h instanceof Object "+ (h instanceof Object));

        h = new Teacher();
        out.println("h instanceof Student "+ (h instanceof Student));
        out.println("h instanceof Teacher "+ (h instanceof Teacher));
        //System.out.println("h instanceof Date "+ (h instanceof Date));
        out.println("null instanceof Object "+ (null instanceof Object));

    }
}