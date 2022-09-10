package Revision_Question;

import java.util.*;
public class Count_SubArray_Sum_EqualTo_K {
    public static void main(String[] args) {
        int arr[]={10 , 2, -2, -20, 10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ct=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int diff=sum-k;
            if(map.containsKey(diff))
            {
                ct+=map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ct);
    }
}
