import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        ListNode z = new ListNode("four",
        new ListNode("one",
        new ListNode("two",
        new ListNode("three",
        new ListNode("six",null)))));
        while( z != null)
        {
            out.println(z.getValue());
            z=z.getNext();
        }
        
    }
}