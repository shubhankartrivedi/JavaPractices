package com.company;

import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Principle Amount:");
        int p = sc.nextInt();
        System.out.println("Enter your Rate of Interest:");
        int r = sc.nextInt();
        System.out.println("Enter your Time given:");
        int t = sc.nextInt();
        SI(p,r,t);

    }
// Using New Custom Method :
    public static void SI(int p, int r, int t) {
        int si = (p*r*t)/100;
        System.out.println("Your Simple Interest/Profit in "+t+" Year is: "+si);
    }
}

/*
By Shubhankar Trivedi
Date: 24-11-2021
 */
