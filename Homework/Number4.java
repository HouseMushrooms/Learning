package Homework;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args){
       int watermelon = 45, totFamMem, wantLeftovers, 
       totJuice = watermelon*5;
       double juicePerMem, leftoverJuice;
       totFamMem = totJuice/2 + totJuice%2;
       juicePerMem = totFamMem*1.5;
       leftoverJuice = totJuice - juicePerMem;
       System.out.println("Timmy has " + totFamMem + " family members and he would have " + leftoverJuice + " juice leftover.");
       System.out.println("Enter how many family members want to take home leftovers"); 
       Scanner sc = new Scanner(System.in);
       wantLeftovers = sc.nextInt();
       sc.close();
       System.out.println("Each family member taking home leftovers would get "
        + leftoversTaken(wantLeftovers, leftoverJuice) + " glasses of juice.");
    }
    public static double leftoversTaken(int wantLeftovers, double leftoverJuice){
        double leftoversTaken = leftoverJuice/wantLeftovers;
        return leftoversTaken;
    }
}
