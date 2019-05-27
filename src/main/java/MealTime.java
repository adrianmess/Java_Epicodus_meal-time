import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MealTime {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            askWhatYouAteFor("breakfast");
            String yourBreakfast = bufferedReader.readLine();
            System.out.println("You had " + yourBreakfast + " for breakfast.");

            askWhatYouAteFor("lunch");
            String yourLunch = bufferedReader.readLine();
            System.out.println("You had " + yourLunch + " for lunch");

            askWhatYouAteFor("dinner");
            String yourDinner = bufferedReader.readLine();
            System.out.println("You had" + yourDinner + " for dinner.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void askWhatYouAteFor(String meal){
        System.out.println("What did you eat for " + meal + "?");
        }
    }

