import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MealTime {
    public static void main(String[] args){
    try{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What did you eat for breakfast?");
        String yourBreakfast = bufferedReader.readLine();
        System.out.println("You had " + yourBreakfast + " for breakfast.");
    }
    catch(IOException e)
        {
        e.printStackTrace();
        }
    }
}
