package maps;

import java.util.HashMap;
import java.util.Iterator;


public class PracticeHashMap 
{
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Anil");
        hm.put(102, "Sunil");
        hm.put(103, "Raja");
        hm.put(104, "Raj");
        hm.put(105, "Raj");
        
        System.out.println(hm);   
        
        Iterator<Integer> itr = ((Object) hm).iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }


}
