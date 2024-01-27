package FizzBuzz;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int numIn = sc.nextInt();
        for (int num = 1; num <= numIn; num++){
            if(num % 3 == 0){
            System.out.println("fizz");
            continue;
        } else if (num % 5 == 0){
            System.out.println("buzz");
            continue;
        }
            System.out.println(num);
       }         
        sc.close();
    }
}