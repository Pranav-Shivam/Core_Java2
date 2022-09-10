package Revision_Question;

import java.util.*;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,6,3,9};
        int n=arr.length;
        double sumOfArr=(n*(n+1))*0.5;
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int x:set) {
            sum+=x;
        }
        int missing=(int)sumOfArr-sum;
        System.out.println(missing);
    }
}
