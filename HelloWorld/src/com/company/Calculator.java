package com.company;

public class Calculator {
    public ProvidesAbstraction ref1;

    // high level module dependent on interface

    double a,b;
    public Calculator(double numA, double numB,ProvidesAbstraction operation )
    {
        ref1=operation;
        a=numA;
        b=numB;
    }
    public void operate()
    {
        ref1.operationM(a,b);
    }
}
