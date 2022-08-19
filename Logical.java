package com.example;

public class Logical
{


    public static void main(String[] args) {
        int boy, girl;
        boy =20;
        girl =40;
     //both test in either side have to be true if not it will do the else
        if(boy >18 && girl > 50)
        {
            System.out.println("You qualify to enter");
        }
        else {
            System.out.println("You dont qualify to enter");


        }
        //either one will have to be true in order to quality
        if(boy > 18 || girl>40)
        {
            System.out.println("You qualify to enter");
        }
        else {
            System.out.println("You dont qualify to enter");


        }

    }
}
