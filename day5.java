package com.company;

import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        System.out.println("Multiplication of 2x2 Matrices");
        Scanner sc = new Scanner(System.in);
        System.out.println("[a b]x[e f]\n[c d] [g h]");
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("["+a+" b]x[e f]\n[c d] [g h]");
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("["+a+" "+b+"]x[e f]\n[c d] [g h]");
        System.out.println("Enter value of c:");
        int c = sc.nextInt();
        System.out.println("["+a+" "+b+"]x[e f]\n["+c+" d] [g h]");
        System.out.println("Enter value of d:");
        int d = sc.nextInt();
        System.out.println("["+a+" "+b+"]x[e f]\n["+c+" "+d+"] [g h]");
        System.out.println("Enter value of e:");
        int e = sc.nextInt();
        System.out.println("["+a+" "+b+"]x["+e+" f]\n["+c+" "+d+"] [g h]");
        System.out.println("Enter value of f:");
        int f = sc.nextInt();
        System.out.println("["+a+" "+b+"]x["+e+" "+f+"]\n["+c+" "+d+"] [g h]");
        System.out.println("Enter value of g:");
        int g = sc.nextInt();
        System.out.println("["+a+" "+b+"]x["+e+" "+f+"]\n["+c+" "+d+"] ["+g+" h]");
        System.out.println("Enter value of h:");
        int h = sc.nextInt();
        System.out.println("["+a+" "+b+"]x["+e+" "+f+"]\n["+c+" "+d+"] ["+g+" "+h+"]");
        System.out.println("Thanks for all the Values!");
        Quad(a, b , c , d , e, f , g , h );

    }

    public static void Quad(int a, int b, int c , int d , int e , int f , int g , int h) {
        int x1 = (a*e)+(b*g);
        int x2 = (c*e)+(d*g);
        int x3 = (a*f)+(b*h);
        int x4 = (c*f)+(d*h);
        System.out.println("The Result is:");
        System.out.println("["+x1+" "+x3+"]\n["+x2+" "+x4+"]");
    }

}
