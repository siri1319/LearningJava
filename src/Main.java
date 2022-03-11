import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! this is me ");
        int StudentAge = 3;
        double StudentGpa = 4.5;
        String StudentFirstName = "Tom";
        String StudentLastName = "Hanks";
        boolean StudentAttendance = true;
        char StudentInitial = StudentFirstName.charAt(0);
        System.out.println(StudentAge);
        System.out.println(StudentGpa);
        System.out.println(StudentAttendance);
        System.out.println(StudentInitial);
        System.out.println(StudentFirstName +" "+ StudentLastName +" has GPA of " + StudentGpa);
        System.out.println("Do you want to update the Student Firstname ?");
        Scanner input = new Scanner(System.in);
        //StudentGpa = input.nextDouble();
        //System.out.println("Student GPA is now "+ StudentGpa);
        StudentFirstName = input.next();
        System.out.println("Student Name is Updated: "+StudentFirstName +" "+StudentLastName);
    }
}
