package com.example;

public class Comparison
{
    public static void main(String[] args) {
        //this programme used to compare two variables or more
        int num1 = 10;
        int num2 = 5;
        double num3 = 5.2;
        //== it checks if is equal to
        //<=less or equal to
        //>= greater or equal to
        //!= is not equal to
        //< less than
        boolean c = (num1 > num2);
        System.out.println(c);
        if (num1== num3)
        {
            System.out.println("Their Equal ");
        }
        else
        {
            System.out.println("Their not Equal ");
        }
        if (num3>=0 && num3<=100)
        {
            System.out.println("num 3 is in the range ");
        }
    }
}
