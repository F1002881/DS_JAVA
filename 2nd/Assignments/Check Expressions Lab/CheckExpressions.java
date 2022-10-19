import java.util.*;
import java.io.*;

public class CheckExpressions {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Check Expressions Lab/expressions.txt"));
        Map<String, String> symbolsMap = new HashMap<>();
        symbolsMap.put("{", "}");
        symbolsMap.put("(", ")");
        symbolsMap.put("<", ">");
        symbolsMap.put("[", "]");
        

        int numExp = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numExp; i++)
        {
            String line = scan.nextLine();

            for(int x = 0; x < line.length(); x++)
            {
                
            }
        }

    }
}
