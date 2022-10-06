import java.util.*;
import java.io.*;

public class MergeGradeResults{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Merge Grades Exercise/merge.txt"));
        int numClasses = Integer.parseInt(scan.nextLine());
        HashMap<String, Integer> classes = new HashMap<String, Integer>();
        for(int i = 0; i < numClasses; i++)
        {
            for(int y = 0; y < 4; y++)
            {
                String line = scan.nextLine();
                String letter = line.substring(0, line.indexOf(" "));
                int num = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
                if(classes.get(letter) == null){
                    classes.put(letter, num);
                }
                else{
                    classes.put(letter, num + classes.get(letter));
                }
            }
        }
        for(Map.Entry<String, Integer> grade : classes.entrySet())
        {
            System.out.println(grade.getKey() + " " + grade.getValue());
        }
    }
}