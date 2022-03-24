package com.company;

public class AddandSubtract implements Addition,Subtraction{

    // Liskov Substitution because it can substitute it's parent without any interruption

    public int add(int a, int b) {
        return a+b;
    }
    public  int subtract(int a,int b)
    {
        return a-b;
    }
    public void performOperation()
    {
        System.out.println("Operations performed");
    }
}
