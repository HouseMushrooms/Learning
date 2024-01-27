package Lessons;
public class LessonOne{
    public static void main(String[] args){
        int a = 2;
        int b = 4;

        System.out.println(a + b + addOne(5));
        System.out.println(ope(4, -2, 3, 6));

        System.out.println("The number of a is" + a + " "+ (a+b));
    }
    public static int addOne(int num){
        num = num + 1;
        return num;
    }
    public static double ope(double y2, double y1, double x2, double x1){
       double slope = ((y2 - y1)/(x2 - x1));
        return slope;
    
    }
    
}
