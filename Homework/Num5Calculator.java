package Homework;

import java.util.Scanner;

public class Num5Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        main2(sc);
        main2(sc);
        sc.close();
    }
    public static void main2(Scanner sc){
        System.out.print("Enter the operation you want to do: ");
        String operation = "";
        while (operation == ""){
            operation = sc.nextLine();
        }
        
        switch (operation){
            case "addition":
            addition(sc);
            break;
            case "subtraction":
            subrtaction(sc);
            break;
            case "multiplication":
            multiply(sc);
            break;
            case "division":
            divide(sc);
            break;
            case "remainder":
            remainder(sc);
            break;
            case "square":
            squaring(sc);
            break;
        }
    }
    public static double apple(Scanner sc, String thing){
        double num;
        System.out.println("Enter the "+ thing +" number");
        num = sc.nextDouble();
        return num;
    }
    public static void addition(Scanner sc){
        double addNum1, addNum2, addTot;
        addNum1 = apple(sc, "first");
        addNum2 = apple(sc, "second");
        addTot = addNum1 + addNum2;
        System.out.println(addTot);
    }
    public static void subrtaction(Scanner sc){
        double subNum1, subNum2, subTot;
        subNum1 = apple(sc, "first");
        subNum2 = apple(sc, "second");
        subTot = subNum1 - subNum2;
        System.out.println(subTot);
    }
    public static void multiply(Scanner sc){
        double multNum1, multNum2, multTot;
        multNum1 = apple(sc, "first");
        multNum2 = apple(sc, "second");
        multTot = multNum1 * multNum2;
        System.out.println(multTot);
    }
    public static void divide(Scanner sc){
        double divNum1, divNum2, divTot;
        divNum1 = apple(sc, "first");
        divNum2 = apple(sc, "second");
        divTot = divNum1 / divNum2;
        System.out.println(divTot);
    }
    public static void remainder(Scanner sc){
        double remNum1, remNum2;
        int remTot, remRemainder;
        remNum1 = apple(sc, "first");
        remNum2 = apple(sc, "second");
        remTot = (int) (remNum1 / remNum2);
        remRemainder = (int) (remNum1%remNum2);
        System.out.println(remTot + " R" + remRemainder);
    }
    public static void squaring(Scanner sc){
        double squNum1, squTot;
        squNum1 = apple(sc, "first");
        squTot = squNum1 * squNum1;
        System.out.println(squTot);
    }
}
