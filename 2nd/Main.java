import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Stack<String> s1;
        s1 = new Stack<String>();
        Stack<String> s2;
        s2 = new Stack<String>();
        s1.push("A");
        s1.push("B");
        System.out.println(s1.pop());
        s2.push(s1.peek());
        s2.push("D");
        s1.push(s2.pop());
        System.out.println(s1.peek());
        System.out.println(s2.peek());
        s1.push(s2.pop());
        s1.push("F");
        s1.pop();
        s1.push("G");
        s1.pop();
        System.out.println(s1.pop());
        s2.push(s1.peek());
        s2.push("H");
        while(!s1.isEmpty())
        System.out.println(s1.pop());
        while(!s2.isEmpty())
        System.out.println(s2.pop());
        
    }
}