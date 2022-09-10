package Revision_Question;

import java.util.*;
public class PairSum_EqualTo_K {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,2,8,9};
        int k=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i );
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int dif=k-arr[i];
            if(map.containsKey(dif))
            {
                list.add(arr[i]);
                list.add(dif);
                break;
            }
        }
        System.out.println(list);
    }
}
