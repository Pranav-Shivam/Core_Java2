package Pratice;

import java.util.*;


public class SubArraySumEqual_0 {

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, -2, 1};
        int result[]=subArraysumEqTo0(arr);
        if(result.length>1)
        {
            System.out.println(Arrays.toString(subArraysumEqTo0(arr)));
        }
        else
        {
            System.out.println("No Elements found");
        }
    }
    public static int[] subArraysumEqTo0(int arr[]) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int f = 0, l = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                if (i + 1 > maxLen) {
                    f = 0;
                    l = i;
                    maxLen = i + 1;
                }
            } else if (map.containsKey(sum)) {
                int prev = map.get(sum);
                if (i - prev > maxLen) {
                    maxLen = i - prev;
                    f = prev + 1;
                    l = i;
                }
            } else {
                map.put(sum, i);
            }
        }
        return Arrays.copyOfRange(arr, f, l + 1);
    }
}



