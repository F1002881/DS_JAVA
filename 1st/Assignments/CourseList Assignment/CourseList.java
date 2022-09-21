import java.io.*;
import java.util.*;

public class CourseList{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Assignments/CourseList Assignment/classes.txt"));
        Set<String> courses = new TreeSet<String>();
        while(scan.hasNextLine())
        {
            String[] lineArr = scan.nextLine().split(" ");
            courses.add(lineArr[1]);
        }
        System.out.println(courses);
    }
}