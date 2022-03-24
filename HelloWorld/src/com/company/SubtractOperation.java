package com.company;

public class SubtractOperation implements ProvidesAbstraction{
    @Override
    public void operationM(double numA, double numB) {
        System.out.println(numA-numB);
    }
}
