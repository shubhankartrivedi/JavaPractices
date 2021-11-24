package com.company;

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gg = 0;
        while (gg < 6) {
            System.out.println("Enter you Cars one by one:");
            String[] cars = {sc.next(), sc.next(), sc.next(), sc.next()};
            int r1 = 0;
            System.out.println("Your Cars:");
            while (r1 < 4) {
                System.out.print(r1 + ": " + cars[r1] + "  ");
                r1++;
            }
            System.out.println("Which Car you wanna Select? Enter its Number:");
            int d1 = sc.nextInt();
            System.out.println("You have selected " + cars[d1] + " for your Race!\nTo Start the Race , Type 1 else 2");
            int f1 = sc.nextInt();
            if(f1==1){
                System.out.println("Your First Race is going to Start! Be Ready!");
                System.out.println("Turn Left by Typing '1' and Right by '2' and Boost by '3'");
                System.out.println("3....2.....1.....GO!");
                System.out.println("Boost!");
                int b1 = sc.nextInt();
                if(b1!= 3){
                    System.out.println("Your Car Crashed!... Restarting!");
                }
                else{
                    System.out.println("you just BOOOOOOOSTED!.........yay");
                    System.out.println("Turn Left!!");
                    int r2 = sc.nextInt();
                    if(r2!=1){
                        System.out.println("You Crashed.... Restarting");
                    }
                    else{
                        System.out.println("Yeah you are Fast!...");
                        System.out.println("Use Boost its a straight Road!");
                        int b2 = sc.nextInt();
                        if(b2!=3){
                            System.out.println("You Crashed .... Just do What i say!.. Restarting!");
                        }
                        else{
                            System.out.println("Your "+cars[d1]+" is going fast!");
                            System.out.println("Turn Right!!!");
                            int r22 = sc.nextInt();
                            if(r22!=2){
                                System.out.println("You Just Crashed! Restarting now!....");
                            }
                            else{
                                int rank = (int) (Math.random()*10);
                                System.out.println("Yay Your just got "+rank+" Rank! with your "+cars[d1]);
                                System.exit(0);
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("Restarting!....");
            }
            }
        }
    }

    /*
    created by Shubhankar Trivedi
    Date: 24-11-2021
     */

