import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void goodMorning(){
        System.out.println("Good Morning..!! please enter any number from 1 to 5 to try your luck!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 3){
            System.out.println("You are the Luckiest person today!!!");
            }
        else
        {
            System.out.println("You are not lucky!!! Try your luck tomorrow!!! ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Job! ");
        goodMorning();

        System.out.println("All the best for your rest of the day. Thank you!");



    }


}
