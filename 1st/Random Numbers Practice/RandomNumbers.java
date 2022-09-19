import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<Integer>();
        System.out.println(s.size());
        s.add(10);
        s.add(40);
        s.add(60);
        s.add(90);
        s.add(100);
        System.out.println(s);
        System.out.println(s.add(60));
        System.out.println(s);
        System.out.println(s.remove(10));
        System.out.println(s.isEmpty());
        TreeSet<String> set = new TreeSet<String>();
        set.add("purple");
        set.add("blue");
        set.add("yellow");
        set.add("red");
        set.add("black");
        System.out.println(set); 

        for(String val: set)
        {
            System.out.println(val);
        }

    }
}
