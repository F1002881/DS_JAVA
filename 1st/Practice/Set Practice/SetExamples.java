import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Integer[] arr1 = {0,2,4,5,6,8,10};
        Integer[] arr2 = {5,6,7,8,9,10};
        Set<Integer> a = new TreeSet<Integer>(Arrays.asList(arr1));
        System.out.println(a);
        Set<Integer> b = new TreeSet<Integer>(Arrays.asList(arr2));
        System.out.println(b);
        Set<Integer> c = new TreeSet<Integer>(Arrays.asList(arr2));
        c.addAll(b);
        System.out.println(c);
        Set<Integer> d = new TreeSet<Integer>(a);
        d.retainAll(b);
        System.out.println(d);
        Set<Integer> e = new TreeSet<Integer>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
