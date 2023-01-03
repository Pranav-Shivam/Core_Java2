package Pratice;

import java.util.*;
public class MissingInSortedArray {
    public static void main(String[] args) {
        int arr[]={6,1,3,6,4,5,2};
        System.out.println(solution(arr));
    }
    static int solution(int arr[])
    {
        Set<Integer> set=new TreeSet<>();
        for (int x:arr) {
            set.add(x);
        }
        int max=Collections.max(set);
        for (int i = 1; i <=max; i++) {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}
