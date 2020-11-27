/*
   this program calculates two circles, one trapped inside a rectangle,
   and another that goes around the rectangle, the rectangle's size is
   is determined by the user via 4 inputs, X Y coordinates of 2 points.

   this program was written by:
   Daniel Levin
   ID: 315048587
 */

package com.company;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        // receive input from the user
        Scanner scan = new Scanner(System.in);

        System.out.println("This program calculates the areas " +
                "and the perimeters of the excircle and the incircle " +
                "of a given rectangle ");

        System.out.print("Please enter the two coordinates of the " +
                "left-upper point of the rectangle");

        // input of the upper left point of the rectangle
        int leftUpX = scan.nextInt();
        int leftUpY = scan.nextInt();

        System.out.print("Please enter the two coordinates of the " +
                "right-lower point of the rectangle");

        // input of the lower right point of the rectangle
        int rightLowerX = scan.nextInt();
        int rightLowerY = scan.nextInt();

        // calculates the values of the inner rectangle
        double innerRadius = (leftUpY - rightLowerY) / 2.0;
        double innerArea = Math.pow(innerRadius, 2) * Math.PI;
        double innerPerimeter = 2 * Math.PI * innerRadius;

        // calculates the values of the outer rectangle
        double outerRadius = Math.sqrt(Math.pow((leftUpY - rightLowerY), 2) + Math.pow((rightLowerX - leftUpX), 2)) / 2;
        double outerArea = Math.pow(outerRadius, 2) * Math.PI;
        double outerPerimeter = 2 * Math.PI * outerRadius;

        System.out.println ("Incircle: radius = " + innerRadius + " area = " + innerArea + " perimeter = " + innerPerimeter);
        System.out.println ("Excircle: radius = " + outerRadius + " area = " + outerArea + " perimeter = " + outerPerimeter);
        
    }
}