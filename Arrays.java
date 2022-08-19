package com.example;

public class Arrays
{
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 100;
        num[1] = 24;
        num[2] = 2;
        num[3] = 84;
        num[4] = 12;

        if (num[3] > 20) {
            System.out.println("your more than the number 20");

        } else if (num[1] < 100) {
            System.out.println("your less than 100");

        } else {
            System.out.println("its any number");

        }
        for (int i = 0; i <= 4; i++)
        {
            System.out.println("The number is: " + num[i]);
        }
    }
    }

