package com.kovanslab.intern.streams;
import java.util.function.Predicate;
import java.util.*;
public class  PredicateExample  {
    public static void main(String[] args) {
        Predicate<Integer> num = n ->n%2==0;
        Predicate<Integer> greater= n -> n>5;
        Predicate<Integer> result = greater.and(num);
        System.out.println(result.test(4));
        Predicate<Integer> resu = greater.or(num);
        System.out.println(resu.test(7));
        Predicate<Integer> re = greater.negate();
        System.out.println(re.test(7));
        System.out.println(num.test(5));
        System.out.println(num.test(9));
        System.out.println(num.test(12));

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,5,8,1,9,4,6));
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);

        boolean res =nums.stream().anyMatch(n-> n>5);
        System.out.println(res);

        boolean ans =nums.stream().allMatch(n-> n>0);
        System.out.println(ans);

        boolean ans2 =nums.stream().noneMatch(n-> n<0);
        System.out.println(ans2);


    }
}
