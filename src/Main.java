import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static double employeeSalary(double hoursPerWeek, double payPerHour){

        double yearlySalary = 52 * hoursPerWeek * payPerHour;
        return yearlySalary;
    }
    public static double vaccation(double unpaiddays, double payPerHour){

        double unpaidSalary = 8 * unpaiddays * payPerHour;
        return unpaidSalary;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Portal!  ");
        System.out.println("Enter employee's work hours per week :");
        Scanner input = new Scanner(System.in);
        double hours = input.nextDouble();
        System.out.println("Enter employee's pay per hour");
        double pay = input.nextDouble();
        double yearSalary = employeeSalary(hours,pay);

        System.out.println("Enter employee's No. of vaccation days :");
        double numberofdays = input.nextDouble();

        double unpaid = vaccation(numberofdays,pay);

        double TotalEmpSal = yearSalary - unpaid;

        System.out.println("Employee Salary is ::" +TotalEmpSal);

    }


}
