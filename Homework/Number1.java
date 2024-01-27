package Homework;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args){
        int years;
        double old;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current salary");
        old = sc.nextDouble();
        System.out.println("Enter how many years you're waiting");
        years = sc.nextInt();
        futureSalary(old, years);
        sc.close();
    }
    public static void futureSalary(double old, double years){
    double oldNew = old + 7000; 
    double salaryIncrease = oldNew + years*250;
    System.out.println("Future Salary:" + salaryIncrease);
}
}
