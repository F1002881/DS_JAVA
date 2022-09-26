import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(10);
        aList.add(50);
        aList.add(100);
        aList.add(70);
        aList.add(40);
        Set<Integer> set = new HashSet<Integer>(aList); 
        Iterator<Integer> it = aList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }
        ListIterator<Integer> it1 = aList.listIterator();
        it1.next();
        it1.set(100);
        System.out.println(aList);
        
        /*
        System.out.println(aList);
        for(Integer num: aList)
        {
            System.out.print(num+"");
        }
        Iterator<Integer> it = aList.iterator();
        while(it.hasNext())
        {
            int val = it.next();
            if(val%2 ==0)
                it.remove();
        }
        System.out.println();
        System.out.println(aList);
        */

    }
}
