import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Answer the below Question ");
        System.out.println("What is the Capital of India?");
        System.out.println("1.Delhi");
        System.out.println("2.Mumbai");
        System.out.println("3.Chennai");
        System.out.println("4.Hyderabad");
        boolean Option = true;
        while (Option)
        {
            Scanner input = new Scanner(System.in);
            String UserInput = input.next().toLowerCase();
            if (UserInput.equals("delhi"))
            {
                System.out.println("You have entered the Correct Option");
                Option=false;
            }
            else {
                System.out.println("You have entered the Wrong option. Please try again");
            }


        }
        System.out.println("Congrats!!! You made it!");
    }


}
