package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x,y;
        final int c = 350;
        double z;
        System.out.print("Enter length: ");
        x = input.nextInt();
        System.out.print("Enter width: ");
        y = input.nextInt();

        double gal = (double)(x*y)/c;

        z = Math.ceil(gal);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.",z,(x*y));




    }//end main method
}//end classB