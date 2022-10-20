import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Queue<String> f = new LinkedList<String>();
        f.add("it");
        f.add("go");
        f.add("we");
        f.add("by");
        while(!f.isEmpty()) {
            System.out.println(f.remove());
        }
        
    }
}