import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static double percentageMarks(int maths1,int science1, int computers1){

        double TotalMarksScored = maths1+science1+computers1;
        double TotalMarks = 75;
        double percentage = Math.round((TotalMarksScored/TotalMarks)*100);
        return percentage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Portal! ");
        System.out.println("Enter student marks:");
        System.out.println("Enter marks scored in maths out of 25");
        Scanner input = new Scanner(System.in);
        int maths = input.nextInt();
        System.out.println("Enter marks scored in Science out of 25");
        int science = input.nextInt();
        System.out.println("Enter marks scored in Computers out of 25");
        int computers = input.nextInt();
        double StudentPercentage = percentageMarks(maths,science,computers);

        System.out.println("Percentage secured by Student is " +StudentPercentage);



    }


}
