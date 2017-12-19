package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Conver a string to int and vice versa

        // declare an int

        int myInt = 1;

        // and a String that contains a number

        String myString = "1";

        // convert a string to an integer

        int myStringInt = Integer.parseInt(myString);

        Integer myStringInteger = new Integer(myString);

        // convert an int to a float (perhaps for further floating-point work)
        float myFloat = new Integer(myInt).floatValue();

        // convert an int to a byte
        byte myByte = new Integer(myInt).byteValue();

        // convert an int to a long
        long myLong = new Integer(myInt).longValue();

        // creates a String object that holds "1"
        String myIntBinary = Integer.toBinaryString(myInt);


        //Exercise 1
        System.out.println("1: ");
        //
        System.out.println("* * * * * *");

        //Exercise 2
        System.out.println("2: ");
        //
        Scanner Exercise2 = new Scanner(System.in);

        System.out.print("Enter a number? ");

        int a = Exercise2.nextInt();

        int i;

        for (i = 1; i <= a; i++) {
            System.out.print("* ");
        }

        System.out.println();

        //Excercise 3
        System.out.println("3: ");
        //
        int b;
        for (b = 1; b <= 4; b++){

            int c;

            for (c = 1; c <= 6; c++){
                System.out.print("* ");
            }

            System.out.println();

        }

        //Exercise 4
        System.out.println("4: ");
        //
        System.out.println("Hello, I'm gonna draw a matrix for you");

        Scanner Exercise3 = new Scanner(System.in);

        System.out.print("How many columns? ");

        int num_Columns = Exercise3.nextInt();

        System.out.print("How many rows? ");

        int num_Rows = Exercise2.nextInt();

        int x;

        for (x = 1; x <= num_Rows; x++){

            int y;

            for (y = 1; y <= num_Columns; y++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //Exercise 5
        System.out.println("5: ");
        //
        int myNumber = 95;

        System.out.println("Guess my number");

        while( true ) {

            System.out.print("Enter a nuber (from 0 to 100): ");

            Scanner Exercise5 = new Scanner (System.in);

            int numberIn = Exercise5.nextInt();

            if (numberIn == 95) {

                System.out.println("Jack pot");

                break;
            }
            else if (numberIn < 0 || numberIn >100) {

                System.out.println("Please take a look at the condition! ");

            } else {
                
                System.out.println("A little too small :( ");
            }
        }





    }
}
