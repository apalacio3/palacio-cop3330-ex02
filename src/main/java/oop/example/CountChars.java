/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class CountChars
{
    public static void main( String[] args )
    {
        System.out.print("What is the string input? ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        String output = inputString + " has " + inputString.length() + " characters.";

        System.out.println(output);
    }
}
