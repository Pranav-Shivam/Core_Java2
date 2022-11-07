package Pratice;

import java.util.*;

public class AddPrimeIndexString {
    public static void main(String[] args) {
        System.out.println(Remove("abcd"));
    }
    public static String Remove(String S)
    {
        String result="";
        LinkedHashMap<Character ,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i <S.length() ; i++) {
            char ch=S.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch: map.keySet()) {
            if(!isPrime(map.get(ch)) || map.get(ch)==1){
                for (int i = 0; i < map.get(ch); i++) {
                    result+=ch;
                }
            }
        }
        if (result.length()==0) {
            return "MARY";
        }
        return result;
    }
    public static boolean isPrime(int n)
    {
        int ct=0;
        for (int i=2;i<=n;i++)
        {
            if(n%i==0){
                ct++;
            }
            if (ct >1) {
                return false;
            }
        }
        return true;
    }
}
