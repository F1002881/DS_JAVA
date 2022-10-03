import java.util.*;
import java.io.*;

public class SwimmingClasses{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Swimming Classes Assignment/swimming-1.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        ArrayList<String> teachers = new ArrayList<String>();
        ArrayList<String> students = new ArrayList<String>();
        TreeMap<String, TreeSet<String>> teacherStudentMap = new TreeMap<String, TreeSet<String>>();
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            String teacher = line.split(" ")[0];
            String student = line.split(" ")[1];
            teachers.add(teacher);
            students.add(student);
        }

        for(int i = 0; i < teachers.size(); i++)
        {
            TreeSet<String> studentsWithTeacher = new TreeSet<String>();
            for(int x = 0; x < teachers.size(); x++)
            {
                if(teachers.get(x).equals(teachers.get(i)))
                {
                    studentsWithTeacher.add(students.get(x));
                }
            }
            teacherStudentMap.put(teachers.get(i), studentsWithTeacher);
        }
        
        Iterator<String> it = teacherStudentMap.keySet().iterator();
        while(it.hasNext())
        {
            String teach = it.next();
            System.out.println(teach);
            for(String stu : teacherStudentMap.get(teach))
            {
                System.out.println("   " + stu);
            }
            System.out.println("");
        }
    }
}