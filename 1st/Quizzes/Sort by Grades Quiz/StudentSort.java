import java.util.*;
import java.io.*;


public class StudentSort {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("studentGrades.txt"));
        int count = Integer.parseInt(scan.nextLine());
        String[] studentArr = new String[count];
        for(int i = 0; i < count; i++)
        {
            studentArr[i] = scan.nextLine();
        }
        

        for(int i = 0; i < count; i++)
        {
            for(int x = count - 1; x >= 1; x--)
            {
                String[] studentSplit1 = studentArr[x].split(" ");
                String[] studentSplit2 = studentArr[x - 1].split(" ");
                if(Integer.parseInt(studentSplit1[2]) > Integer.parseInt(studentSplit2[2]))
                {
                    String temp = studentArr[x - 1];
                    studentArr[x - 1] = studentArr[x];
                    studentArr[x] = temp;
                }
            }
        }

        for(int i = 0; i < count; i++)
        {
            System.out.println(studentArr[i]);
        }
    }
}
