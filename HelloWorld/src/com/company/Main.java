package com.company;

import com.company.cleanCode.SelectOperation;

public class Main {

    public static void main(String[] args) {
        ProvidesAbstraction provideabs = new AddOperation();

        // module depends on interface & open for extension like add,multiply (S,O,D satisfied)

        Calculator calculate = new Calculator(14,10,provideabs);
        calculate.operate();

        Subtraction sub=new AddandSubtract();  // (L,I satisfied)
        System.out.println(sub.subtract(14,10));
    }
}
