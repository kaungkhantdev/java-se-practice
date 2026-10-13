package com.astronity.app.testing2;

interface GenMap<T> {
    T map(T data);
}

interface GenTwoMap<T, V> {
    T map(V data);
}



public class GenFiDemo {
    static String toUpper(String str)
    {
        return str.toUpperCase();
    }
    static Integer inc(Integer x)
    {
        return x+1;
    }
    static Integer length(String str)
    {
        return str.length();
    }
    static String toString(Integer x)
    {
        return x+"";
    }
    public static void main(String[] args) {
        GenMap<String> getMap = GenFiDemo::toUpper;
        GenMap<Integer> intMap = GenFiDemo::inc;
        System.out.println("Inc "+intMap.map(10));

        GenTwoMap<String,Integer> map2 = GenFiDemo::toString;
        System.out.println("Map2 "+ map2.map(100));

        GenTwoMap<Integer,String> mapLength = GenFiDemo::length;
        System.out.println("Map Length "+mapLength.map("Hello"));
    }
}
