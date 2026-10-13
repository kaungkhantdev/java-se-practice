package com.astronity.app;

public class SumDemo {
    static int sum(String msg, int ...arr)
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total += arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int result = sum("Hello",1,2);
        System.out.println("Sum "+result);

        System.out.println("Sum "+sum("Hello",1,2,3,4,5));
    }
}
