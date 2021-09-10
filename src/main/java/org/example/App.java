package org.example;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int length, width;
        double squareFeet, gallonsNeeded;
        final int gallonCoverage = 350;

        System.out.println( "What is the ceiling length in feet? " );

        length = scanner.nextInt();

        System.out.println( "What is the ceiling width in feet? " );
        width = scanner.nextInt();

        squareFeet = length * width;
        gallonsNeeded = Math.ceil(squareFeet / gallonCoverage);

        System.out.println( "You will need to purchase " + (int)gallonsNeeded +
                " gallons of paint to cover " + (int)squareFeet + " square feet." );
    }
}
