package com;
import java.util.Scanner;

public class root {
        public void root(){
            Scanner num = new Scanner(System.in);
            System.out.println("Insert the number");
            int number = num.nextInt();
            System.out.println("The root of the number is :" + Math.sqrt(number));
        }
    }

