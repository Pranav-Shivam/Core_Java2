package LeetCode;

import java.util.*;

public class InterSection2Array_349 {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1}, nums2[] = {2,2};
        System.out.println(new InterSection2Array_349().intersection(nums1,nums2).toString());
    }
    public int[] intersection(int[] nums1, int[] nums2)
    {
        TreeSet<Integer> res=new TreeSet<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i]))
            {
                res.add(nums2[i]);
            }
        }
        int arr[]=new int[res.size()];

        Object[] it= res.toArray();
        for (int j = 0; j < it.length; j++) {
            arr[j]= (int)it[j];
        }

        return arr;
    }
}
