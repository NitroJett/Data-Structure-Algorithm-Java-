package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapTut {
//hashset is used to store only keys whereas hashmap is used to store key,value pair
	
	
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,Integer> m=new HashMap<>();
       m.put("gfg", 10);
       m.put("ide", 15);
       m.put("course", 20);
       System.out.println(m);
       System.out.println(m.size());
       for(Map.Entry<String,Integer> e:m.entrySet())                               //traverse HashMap
    	   System.out.println(e.getKey() +" "+e.getValue());
       
       if(m.containsKey("gfg"))
    	   System.out.println("Yes");
       else
    	   System.out.println("No");
       
       m.remove("ide");                                              //remove function return value of the key
       
       System.out.println(m.size());
       
       if(m.containsValue(15))
    	   System.out.println("yes");
       else
    	   System.out.println("No");
       
       System.out.println(m.get("gfg"));
       System.out.println(m.get("ide"));   
	}

}
