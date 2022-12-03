package LeetCode;

import java.util.*;

public class ThirdMaximunNo_414 {
    public static void main(String[] args)
    {
        int arr[]={2,2,3};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums)
    {
        int result=0;
        TreeSet<Integer> set=new TreeSet<>();
        for (int x:nums)
        {
            set.add(x);
        }
        System.out.println(set);
        if(set.size()<3)
        {
            return Collections.max(set);
        }
        set.remove(set.last());
        set.remove(set.last());
        result=(int) set.last();
        return result;
    }
}
