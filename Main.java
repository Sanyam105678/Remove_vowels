package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Create a scanner class object to take input from the user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Valid String:");
        String str= sc.nextLine();
//prompt the user to enter a valid String.
        StringManipulator obj = new StringManipulator();
        String res = obj.removeVowels(str);
        System.out.println(res);
//call the removeVowels method by creating an object of StringManipulator class.
//print the result
    }
}
