package Homework;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args){
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the coasters");
        radius = sc.nextDouble();
        yarnBalls(radius);
        sc.close();
    }
    public static void yarnBalls(double radius){
        double pi = 3.14159, totBalls, sqIn, totYarn;
        totBalls = pi*(radius*radius);
        sqIn = totBalls*0.5;
        totYarn = sqIn*3;
        System.out.println("You would need " + totYarn + " balls of yarn");
    }

}
