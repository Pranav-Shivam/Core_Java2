package Pratice;

import java.util.*;

public class Reverse_Array_In_Group {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 3;
        int n = list.size();
        reverseInGroups(list,n,k);
    }
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0; i<n; i=i+k)
        {
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while(start<end)
            {
                int temp = arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
        System.out.println(arr);
    }
}
