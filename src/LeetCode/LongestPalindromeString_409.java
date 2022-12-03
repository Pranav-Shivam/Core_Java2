package LeetCode;

import java.util.*;

public class LongestPalindromeString_409 {
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ct=0;
        for (char ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==0)
            {
                ct++;
            }
        }
        if(ct*2==s.length())
        {
            return ct*2;
        }
        if(ct*2<s.length())
        {
            return ct*2+1;
        }
        return ct;
    }
}
