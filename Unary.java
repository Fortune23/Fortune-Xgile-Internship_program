package com.example;

public class Unary {
    public static void main(String[] args) {

        int a = 12;
        int b = 10;
        boolean is_thursday=true;
        //Incrementing the value a and adding value a

        System.out.println(a++ + a);
        //decrementing value b by 1
        System.out.println(--b);

        //unary is also used in boolean variable
        System.out.println(!is_thursday);

    }
}