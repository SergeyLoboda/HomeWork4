package com.epam.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number -> ");
        int var = scan.nextInt();
        String str = ToBinary(var);
        System.out.println( "Number to binary " + str);
    }
    static String ToBinary(int var)
    {
        String str = "";
        while (var > 0);
        {
            str =  ((var % 2) == 0 ? "0" : "1") + str;
            var = var/2;
        }
        return str;
    }
}
