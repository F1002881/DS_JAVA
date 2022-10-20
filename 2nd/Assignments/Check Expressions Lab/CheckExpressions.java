import java.util.*;
import java.io.*;

public class CheckExpressions {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Check Expressions Lab/expressions.txt"));
        Map<Character, Character> symbolsMap = new HashMap<>();
        symbolsMap.put('{', '}');
        symbolsMap.put('(', ')');
        symbolsMap.put('<', '>');
        symbolsMap.put('[', ']');
        
        int numExp = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numExp; i++)
        {
            String line = scan.nextLine();
            String lineSymbols = "";
            for(int j = 0; j < line.length(); j++)
            {
                if(symbolsMap.containsKey(line.charAt(j)) || symbolsMap.containsValue(line.charAt(j)))
                    lineSymbols += line.charAt(j);
            }

            Stack<Character> lineStack = new Stack<Character>();
            boolean isValid = false;
            if(lineSymbols.length() % 2 == 0)
            {
                for(int x = 0; x < lineSymbols.length(); x++)
                {
                    char symbol = lineSymbols.charAt(x);
                    if(symbolsMap.containsKey(symbol))
                    {
                        lineStack.push(symbol);
                    }
                    else if(symbolsMap.containsValue(symbol) && lineStack.size() != 0)
                    {
                        if(symbolsMap.get(lineStack.pop()) == symbol)
                            isValid = true;
                        else
                            isValid = false;
                    }
                }
            }
            if(isValid)
                System.out.println("Valid Expression");
            else
                System.out.println("Invalid Expression");
        }
    }
}