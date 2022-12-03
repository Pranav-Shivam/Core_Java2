package LeetCode;

import java.util.*;
public class Fizz_Buzz_412 {
    public static void main(String[] args) {
        System.out.println(new Fizz_Buzz_412().fizzBuzz(3));
    }
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (i%3==0 && i%5==0) {
                list.add("FizzBuzz");
                continue;
            }
            if(i%3==0)
            {
                list.add("Fizz");
            } else if (i%5==0) {
                list.add("Buzz");
            }
            else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
