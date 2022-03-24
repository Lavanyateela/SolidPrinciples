package com.company.badcode;

import com.company.Addition;
import com.company.Subtraction;
import java.util.*;

public class Main {
    public static void main(String args[]){


        SubtractOperation obj1 = new SubtractOperation();
        //module not depend on Interface & not open for extension like add,multiply(O,D Violates)

        Calculator obj2 = new Calculator(14,10,obj1);
        obj2.operate();

        AddandSubtract obj3 = new AddandSubtract(14,10);
        obj3.operation("add");
        System.out.println(obj3.add());
        obj3.operation("subtract");
        System.out.println(obj3.subtract());

    }
}
