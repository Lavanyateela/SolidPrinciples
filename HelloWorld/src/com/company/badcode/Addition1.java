package com.company.badcode;

public class Addition1 implements Operation{
    public void add()
    {
        System.out.println("perform Addition");
    }

    // voilates 'Interface Segregation' because we can't force to include subtract operation as its requirement
    // If we remove subtract then it voilates 'Liskov's substitution principle' as it cannot substitute it's parent

    public void subtract() {
        System.out.println("perform subtraction");
    }

}
