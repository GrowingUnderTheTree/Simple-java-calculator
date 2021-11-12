package com;

import java.util.Scanner;

public class ant {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.println("Please type out what you need to calculate.Type 0 to know what you can calculate");

        int Stuffs = calculator.nextInt();
        if (Stuffs ==0){
            System.out.println("Press 1 for root\n press 2 for pythagoras theory \n press 3 for for quadratic formula \n press 4 for the area of circle");
        } else if (Stuffs ==1){
            Scanner num = new Scanner(System.in);
            System.out.println("Insert the number");
            int number = num.nextInt();
            System.out.println("The root of the number is :" + Math.sqrt(number));
        } else if (Stuffs ==2){
            Scanner A1 = new Scanner(System.in);
            System.out.println("Enter the first number");
            double l = A1.nextDouble();
            Scanner A2 = new Scanner(System.in);
            System.out.println("Enter the second number");
            double h = A2.nextDouble();
            System.out.println("the pythagoras of the triangle is" + Math.sqrt((l*l)+(h*h)));

        } else if (Stuffs ==3){
            double root1, root2;
            Scanner a = new Scanner(System.in);
            System.out.println("Enter the first number");
            double one = a.nextDouble();
            Scanner b = new Scanner(System.in);
            System.out.println("Enter the second");
            double two = b.nextDouble();
            Scanner c = new Scanner(System.in);
            System.out.println("Enter the third");
            double three = c.nextDouble();
            double determinant = two * two - 4 * one * three;

            if (determinant > 0){
                root1 = (-two + Math.sqrt(determinant)) / (2 * one);
                root2 = (-two - Math.sqrt(determinant)) / (2 * one);

                System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
            } else if (determinant == 0) {
                root1 = root2 = -two / (2 * one);
                System.out.format("root1 = root2 = %.2f;", root1);
            } else {
                double real = -two / (2 * one);
                double imaginary = Math.sqrt(-determinant) / (2 * one);
                System.out.format("root1 = %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
            }
        } else if (Stuffs ==4){
            final double pi = 3.14;
            Scanner rad = new Scanner(System.in);
            System.out.println("enter the radius of the circle in centimeter");
            double radius = rad.nextDouble();
            System.out.println("The area of the circle is : " + pi*radius*radius);

        }

    }
}
