package com.example;
import java.util.Scanner;

public class Testing
{
    public static void main(String[] args)
    {
        int age ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your age: ");
        age = scanner.nextInt();

        switch (age)
        {
            case 1:
                System.out.println("you can crawl and try to walk");
                break;
            case 2:
                System.out.println("you can tal and walk");
                break;
            case 3:
                System.out.println("you can start running around n speak audible");
                break;
            default:
                System.out.println("I dont know what you can do at this stage");
                break;
        }
    }
}
