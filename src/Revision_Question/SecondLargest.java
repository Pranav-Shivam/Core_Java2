package Revision_Question;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,2,8,9};
        TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        set.remove(set.last());
        System.out.println(set.last());
    }
}
