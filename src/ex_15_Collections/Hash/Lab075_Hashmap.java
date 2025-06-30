package ex_15_Collections.Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab075_Hashmap {
    public static void main(String[] args) {

      //  HashMap hashMap = new HashMap();
      //  Map map =new HashMap();
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        //Adding pairs
        hashMap.put(101,"Jay");
        hashMap.put(102,"Dev");
        hashMap.put(103,"Raj");
        System.out.println(hashMap);

        //Get the size
        System.out.println(hashMap.size());

        //Remove pair
        hashMap.remove(102);
        System.out.println("After remove hashvalue: " +hashMap);

        //Access the value from the key
        System.out.println(hashMap.get(103));

        //get all the keys from keyset
        System.out.println(hashMap.keySet());  //return only key
        System.out.println(hashMap.values());  //Return only value
        System.out.println(hashMap.entrySet()); //return key with value

        //reading data from hashmap
        for (int a:hashMap.keySet()){
            //System.out.println(a);  //only return value
            System.out.println(a + "  " +hashMap.get(a));  //Return Key:Value both
        }

        Iterator<Map.Entry<Integer,String>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        //to clear all the hashvalue
        hashMap.clear();
    }
}
