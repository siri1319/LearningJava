import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        StudentProfile StudentA = new StudentProfile("Tom","Hanks",3.0,2017,"Information Technology");
        StudentProfile StudentB = new StudentProfile("Tony","Stark",4.3,2001,"Artificial Intelligence");

        System.out.println(StudentA.StudentFirstName +" "+ StudentA.StudentLastName);

        StudentA.IncrementGraduationYear();
        System.out.println("Student A graduation year" + StudentA.GraduationYear);
    }


}
