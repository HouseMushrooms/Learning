package Conditionals;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       eqation(sc);
       eqation(sc);
    }
    public static void eqation(Scanner sc){
        int year;
        System.out.println("Enter the year");
        year = sc.nextInt();
        if (year % 400 == 0 ){
            System.out.println("This year is a leap year");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("This year is a leap year");
        }
        else {
            System.out.println("This year is not a leap year");
        }
    }
}