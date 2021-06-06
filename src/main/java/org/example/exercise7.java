/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner roomDim = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = roomDim.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = roomDim.nextInt();

        System.out.println("You entered dimensions " + length + " feet by " + width + " feet.");

        int areaFt = length * width;
        double areaMt = areaFt * 0.09290304;
        System.out.println("The area is ");
        System.out.println("" + areaFt + " square feet");
        System.out.printf("%.3f square meters\n", areaMt);
    }
}
