package com.company;

import java.util.Scanner;

class day4 {
    String name;
    int class1;
    int id;
    day4(String name, int id ,int class1)
    {
        this.name = name;
        this.class1 = class1;
        this.id = id;

    }
}

class Student {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name , ID and Class :");
        day4 stu1 = new day4(sc.next(),sc.nextInt(), sc.nextInt());
        System.out.println("Name :" + stu1.name
                + " and Id :" + stu1.id);

    }
}


 /*
    created by Shubhankar Trivedi
    Date: 24-11-2021
     */
