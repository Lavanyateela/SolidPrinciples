package com.company;

public class AddOperation implements ProvidesAbstraction{

    // Single responsibility because it has responsibility to add two numbers

    @Override
    public void operationM(double numA, double numB) {
        System.out.println(numA+numB);
    }
}
