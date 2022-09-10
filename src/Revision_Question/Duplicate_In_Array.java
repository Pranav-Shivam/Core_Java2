package Revision_Question;

import java.util.*;
public class Duplicate_In_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,2,8,9};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int x:map.keySet()) {
            if(map.get(x)>1)
            {
                list.add(x);
            }
        }
        System.out.println(list);
    }
}
