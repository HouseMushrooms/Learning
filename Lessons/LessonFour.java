package Lessons;
import java.util.Scanner;

public class LessonFour {
    public static void main(String[] args){
        int number;
        System.out.println("Give me the amount of boxes");
        Scanner numofBoxes = new Scanner(System.in);
        number = numofBoxes.nextInt();
        Eggbox(number);
        Flourbox(number);
        System.out.println("You will need " + Eggbox(number) + " eggs and " + Flourbox(number) + "lbs of flour");
        numofBoxes.close();
    }
    public static int Eggbox(int numofBoxes){
        int EggnBox = 3 * numofBoxes;
        return EggnBox;
    }
    public static int Flourbox(int numofBoxes){
        int FlournBox = 2 * numofBoxes;
        return FlournBox; 
    }
}
