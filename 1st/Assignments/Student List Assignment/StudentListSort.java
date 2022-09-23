import java.io.*;
import java.util.*;

public class StudentListSort {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Assignments/Student List Assignment/classes-1.txt"));
        Set<String> names = new TreeSet<String>();
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            names.add(line.substring(0, line.indexOf(" ")));
        }

        System.out.println(names);
    }
}
