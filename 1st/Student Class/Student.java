public class Student{
    private String name;
    private int finalGrade;
    private int absences;

    public Student(String name, int finalGrade, int absences)
    {
        this.name = name;
        this.finalGrade = finalGrade;
        this.absences = absences;
    }

    public String getName()
    {
        return name;
    }

    public int getFinalGrade()
    {
        return finalGrade;
    }

    public int getAbsences()
    {
        return absences;
    }

    public void setFinalGrade(int finalGrade)
    {
        this.finalGrade = finalGrade;
    }

    public void setAbsences(int absences)
    {
        this.absences = absences;
    } 

    public String toString()
    {
        return "Name: " + name + " - Final Grade: " + finalGrade + " - Absences: " + absences;
    }

}
