package Conditionals;

import java.util.Scanner;

public class NumberSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        colors(sc);
        colors(sc);
        sc.close();
    }
    public static void colors(Scanner sc){
        System.out.println("Enter a color of the rainbow:");
        String color = sc.nextLine();
        switch (color){
            case "red":
            System.out.println("This is the first color in the rainbow");
            break;
            case "orange":
            System.out.println("This is the second color in the rainbow");
            break;
            case "yellow":
            System.out.println("This is the third color in the rainbow");
            break;
            case "green":
            System.out.println("This is the fourth color in the rainbow");
            break;
            case "blue":
            System.out.println("This is the fifth color in the rainbow");
            break;
            case "indigo":
            System.out.println("This is the sixth color in the rainbow");
            break;
            case "violet":
            System.out.println("This is the seventh color in the rainbow");
            break;
        }
        
    }
}
