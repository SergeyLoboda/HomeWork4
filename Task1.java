package com.epam.homework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String line = in();
        System.out.print("Enter word : ");
        for (int i = 0; i < findSymbols(line).length(); i++) {
            System.out.print(findSymbols(line).charAt(i) + ", ");
        }
        System.out.println("Symbol");
    }

    private static String findSymbols(String in) {
        String result = "";
        for (int i = 0; i < in.length(); i++) {
            if ((in.indexOf(in.charAt(i), i)) == in.lastIndexOf(in.charAt(i))) {
                result += in.charAt(i);
            }
        }
        return result;
    }

    private static String in() {
        System.out.println("Enter word");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}


