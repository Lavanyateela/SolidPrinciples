package com.company.badcode;

public class AddandSubtract{        //Violates 'S'
    private int a,b;
    public AddandSubtract(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int add(){

        return a+b;
    }
    public int subtract(){
        return a-b;
    }
    public void operation(String op)
    {
        if(op.equals("add"))
        {
            System.out.println("Perform addition");
        }
        else if(op.equals("subtract"))
        {
            System.out.println("Perform subtraction");
        }
    }

}
