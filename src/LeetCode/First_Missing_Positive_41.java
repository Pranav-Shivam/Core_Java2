package LeetCode;

import java.util.*;

public class First_Missing_Positive_41 {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int res=1;
        TreeSet<Integer> set=new TreeSet<>();
        for(int x:nums)
        {
            if(x>0)
            {
                set.add(x);
            }
        }
        if(set.isEmpty())
        {
            return 1;
        }
        int max=Collections.max(set);
        for (int i = 1; i <=max; i++) {
            if(!set.contains(i))
            {
                res=i;
                return res;
            }
        }
        if(res==1)
        {
            res=max+1;
        }
        return res;
    }
}
