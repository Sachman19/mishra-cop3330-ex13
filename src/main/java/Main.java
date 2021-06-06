/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Sachin Mishra
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal. ");
        double principal = input.nextDouble();

        System.out.print("What is the rate of interest? (Please enter a percentage). ");
        double interest = input.nextDouble()  / 100.0;

        System.out.print("Enter the number of years. ");
        int years = input.nextInt();

        System.out.print("How many times is the interest compounded per year? ");
        int compound = input.nextInt();

        // A = P(1 + r/t) ^ (n * t)
        double total = Math.round(100 * principal * Math.pow((1 + (interest / compound)), (compound * years))) / 100.0;

        System.out.println();
        System.out.printf("$%.2f invested for %d years at %.1f interest compounded %d times per year is $%.2f", principal, years, interest * 100, compound, total);

    }
}