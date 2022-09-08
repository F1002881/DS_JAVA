import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[ ] list = {74, 20, 16, 26, 72};

        for(int i=0; i<list.length; i++)
        
                      if(list[i]>list[i+1])
        
                                       list[i]=list[i+1];
        
        for(int x:list)
        
                 System.out.print(x+" ");
        
         
    }
}
