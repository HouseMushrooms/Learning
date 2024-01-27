package Lessons;
import java.util.Scanner;

public class LessonFive {
    public static void main(String[] args){

        int number;
        System.out.println("Give me the number of people");
        Scanner numofPeople = new Scanner(System.in);
        number = numofPeople.nextInt();
        perPerson(number);
        numofPeople.close();

    }
    public static void perPerson(int numofPeople){
        double lbsofChicken = 0.5, numofCrackers = 2, 
        totChicken = lbsofChicken * numofPeople, totCrackers = numofCrackers * numofPeople;
        System.out.println("You need " + totChicken + "lbs of chicken and " + totCrackers + " crackers");
    
    }
}
