package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class PaintCalc
{
    public static void main( String[] args )
    {
        //Define variables
        int length, width;
        double gallon, sqft;
        Scanner input = new Scanner(System.in);

        //user inputs length and width
        System.out.print("Enter room length: ");
        length = input.nextInt();

        System.out.print("Enter room width: ");
        width = input.nextInt();

        //Calculate
        sqft = length * width;
        gallon = Math.ceil(sqft / 350.0);

        //Display calculations
        System.out.println("You will need to purchase " + (int) gallon + " gallons of paint to cover " + (int) sqft +" square feet.");
    }
}
