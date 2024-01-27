package Homework;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args){
       double l1, w1, l2, w2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of yard one");
        l1 = sc.nextDouble();
        System.out.println("Enter the width of yard one");
        w1 = sc.nextDouble();
        System.out.println("For the first yard you need " + perimeter(l1, w1) + " feet of fencing");
        System.out.println("Enter the length of yard two");
        l2 = sc.nextDouble();
        System.out.println("Enter the width of yard two");
        w2 = sc.nextDouble();
        System.out.println("For the second yard you need " + perimeter(l2, w2) + " feet of fencing");
        sc.close();
        
    }
    public static double perimeter(double l, double w){
       double fencingTotal = 2*(l+w);
       return fencingTotal;
    }
}
