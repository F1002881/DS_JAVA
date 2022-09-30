import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        ListIterator<String> it = list.listIterator();
        while(it.hasNext())
        {
            if(it.next() == "a")
            {
                it.remove();
            }
        }
        System.out.println(list);

    }
}