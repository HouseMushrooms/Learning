package Arrays;
import java.util.ArrayList;
public class List {
    public static void main(String[] args){
         ArrayList<Integer> name = new ArrayList<Integer>();
         name.add(15); //Makes index 0 = 15
         name.add(100); //Makes index 1 = 100
         name.add(0, 40); /*Makes index 0 = 40 (0=index number, 40=value)
         ... and pushes all numbers up one index (index 1 now = 15)*/

         name.remove(2); //removes 100 (index 2)
         name.set(1,50); //sets 15 (in index 1) and changes its value to 50

         System.out.println(name.indexOf(50));//returns 1 bc thats its index
         System.out.println(name.indexOf(100));//returns -1 bc it doesn't exist in the array... removed earlier
         System.out.println(name.size());//returns the size/length of the array list
         System.out.println(name.get(0));//returns the value stored in that index
    }       
}
