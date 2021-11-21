package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //scanner initiated
        System.out.println("You wanna Play? 1:Yes or 2:No? "); //Program Starting
        int play1 = sc.nextInt();
        if(play1==2){
            System.exit(0); //Program Exit as per as User Input
        }
        else {                   // Else Statement to Start the Main Program
            int gg = 10;         // For While Loop (Lives Counting and Program exit
            while(gg>=1) {

                System.out.println("Guess Random Number between 0 to 10!");
                int computerNumber = (int) (Math.random() * 10);  //for Random Number and *10 so that we get only number between 0 to 10
                int answer1 = sc.nextInt();   // Getting User Answer

                if (answer1 == computerNumber) {    // Checking the User's Answer with the Correct Answer
                    System.out.println("You  Won ! You have got an Extra Life now!");
                    gg++;       // Giving User Extra Life
                } else {
                    System.out.println("You Failed! You have "+gg+" Lives Left! The Correct Number was:" +computerNumber);
                    gg--;        // Taking 1 Life for Loosing
                }
            }
        }
    }
}

/* Program created by Shubhankar Trivedi
Date : 21-11-2021
 */