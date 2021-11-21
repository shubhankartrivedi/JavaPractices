package com.company;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Maths Exerciser!!");    // Introduction to Program
        System.out.println("You wanna Start? 1:Yes or 2:No?");  // Asking User if he Wanna Start the Program
        int f1 = sc.nextInt();          // Taking User Input
        if(f1!=1){                      // Checking the User's Input
            System.out.println("Program closing...");
            System.exit(0);       // Closing Program
        }
        else{                         // Starting Main Code
            System.out.println("In this Game you will be given \n almost Unlimited Maths Problems! if you fail ,\n the Program will exit else it will be \n keep going and you will be getting points for each Correct Answer! \n Best of Luck!");
            System.out.println("Okay! Lets Start!!");
            int gg = 0;               // For Points and Executing Program
            while(gg<=1000){           // For a Code Loop
                int q1 = (int) ((Math.random()* 10)*2)*3 /* Remove *3 for Easy Difficulty */ , q2 = (int) ((Math.random() * 10)*2)*3;/* Remove *3 for Easy Difficulty */ // Creating two Int Variables and declaring a Random Number and it can be Changed as per the Difficulty
                int a1 = q1*q2;               // Multiplication Question
                // int a1 = q1+q2;            Addition
                // int a1 = q1-q2;            Subtraction
                // int a1 = q1/q2;            Division
                System.out.println(q1+"x"+q2+"= ?");   // Showing Question on User's Screen
                int r2 = sc.nextInt();                 // Taking Answer
                if(r2==a1){                            // Checking Answer of User
                    gg++;                              // Giving 1 Point for each Correct Answer
                    System.out.println("Your Answer is Correct! You Won 1 Point! \n Now you have "+gg+" Points");
                }
                else{
                    System.out.println("Your Answer was Wrong!");
                    System.exit(0);             // Program Close
                }
            }
        }
    }
}

/* Program created by Shubhankar Trivedi
Date : 21-11-2021
 */
