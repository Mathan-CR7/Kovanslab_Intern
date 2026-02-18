package com.kovanslab.intern.collections;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(5);
        set.add(35);

        System.out.println(set);

         set.remove(20);

         System.out.println(set);

         System.out.println(set.contains(30));

         System.out.println(set.size());


         System.out.println(set);



            Iterator<Integer> it = set.iterator();
           {
         while(it.hasNext())
         {
             if(it.next()%2==0)
             {
                 it.remove();
             }
         }
         System.out.println(set);
          }
//        for(Integer num : set) {
//            if(num % 2 == 0) {
//                set.remove(num);
//            }
//        }



    }
}
