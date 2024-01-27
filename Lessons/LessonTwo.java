package Lessons;
public class LessonTwo {
    public static void main(String[] args){
        //need 6 values, make up values, make the average of all the games, display output
        //6 values
            int game1 = 600, game2 = 250, game3 = 320,
             game4 = 530, game5 = 150, game6 = 740;
        System.out.println(verage(game1, game2, game3, game4, game5, game6));
          
    }
    public static int verage(int game1, int game2, int game3, int game4, int game5, int game6){
        int sum = game1 + game2 + game3 + game4 + game5 + game6,
             average = sum/6;
        return average;
    }  
}
