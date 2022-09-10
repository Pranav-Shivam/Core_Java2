package Revision_Question;

import java.util.ArrayList;
import java.util.HashSet;
public class Intersection_In_Two_Array {
    public static void main(String[] args) {
        int arr[]={10 , 2, -2, -20, 10};
        int krr[]={20 , 2, 1, -20, 0};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < krr.length; i++) {
            if(set.contains(krr[i]))
            {
                list.add(krr[i] );
            }
        }
        System.out.println(list);
    }
}
