import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Stack<String> f = new Stack<String>();
        f.push("we");
        f.push("go");
        f.push("by");
        f.push("us");
        while(!f.isEmpty()){
            System.out.println(f.pop());
        }
        
    }
}