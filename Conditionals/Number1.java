package Conditionals;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        bleh(sc);
        bleh(sc);
        sc.close();
    }
    public static void bleh(Scanner sc){
        int num1, num2;
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("The first number is greater");
        }
        else if (num1 < num2) {
            System.out.println("The first number is smaller");
        }
        else {
            System.out.println("The numbers are the same");
        }
      
    }
}
