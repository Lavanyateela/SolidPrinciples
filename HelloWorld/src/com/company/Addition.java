package com.company;

import com.company.cleanCode.ArithmeticOperation;

public interface Addition {

    // Interface Segregation because client can be specific/relevant to his need
    public int add(int a,int b);
}
