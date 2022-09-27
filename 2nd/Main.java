import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        ListIterator<String> it = list.listIterator();
        
        System.out.println(list.size());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        it.remove();
        System.out.println(list);
        it.add("X");
        System.out.println(list);
        System.out.println(it.next());
        System.out.println(it.previous());
        System.out.println(it.previous());
        it.remove();
        System.out.println(list);

    }
}