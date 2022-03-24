package com.company.badcode;

public class Calculator {
       //Dependency Inversion Violation because high level module dependent on low level module
    public SubtractOperation ref1;
    double a,b;
    public Calculator(double numA, double numB, SubtractOperation operation){
        ref1 = operation;
        a = numA;
        b = numB;
    }
    public void operate()
    {
        ref1.operationM(a,b);
    }
}
