public class StudentProfile {
    String StudentFirstName;
    String StudentLastName;
    Double GPA;
    int GraduationYear;
    String Major;

    public StudentProfile(String FirstName, String LastName, Double GPA, int GraduationYr, String Major)
    {
        this.StudentFirstName = FirstName;
        this.StudentLastName = LastName;
        this.GPA = GPA;
        this.GraduationYear = GraduationYr;
        this.Major = Major;
    }

    /*public static int IncrementGraduationYear(int GraduationYr)
    {
        return GraduationYr+1;
    }*/
    public void IncrementGraduationYear()
    {
        this.GraduationYear=this.GraduationYear+1;
    }

}
