package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTut {
//add keys in hashSet
	//add,contains,iterator,remove,isEmpty
	//on average all have O(1) add,remove,size,contains,isEmpty()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet<String> h=new HashSet<>();
         h.add("gfg");
         h.add("courses");
         h.add("ide");
         System.out.println(h);
         System.out.println(h.contains("gfg"));
         
         Iterator<String> i=h.iterator();
         while(i.hasNext())
        	 System.out.print(i.next()+" ");
         System.out.println();
         //it does not add duplicate items
         System.out.println("size "+h.size());
         for(String s:h)
        	 System.out.print(s+" ");
         h.remove("ide");
         System.out.println();
         System.out.println(h.isEmpty());
         
         h.clear();
         //clear the whole content of hashSet
         System.out.println(h);
         
	}

}
