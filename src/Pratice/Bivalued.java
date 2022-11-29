package Pratice;

import java.util.ArrayList;
import java.util.Collections;

public class Bivalued {
    public static void main(String[] args) {
        String s="10Spt8";
        String n="75";
        System.out.println(SearchingChallenges(n));
//        int arr[]={1,2,3};
//        System.out.println(ArrayChallenge(arr));
    }
    public static int SearchingChallenge(String s)
    {
        int sum=0;
        String str[]=s.split("[a-zA-Z\s]+");
        for (String ss:str
        ) {
            int x=Integer.parseInt(ss);
            sum+=x;
        }
        return sum;
    }
    public static String SearchingChallenges(String num){
        int x=Integer.parseInt(num);
        int m=x%60;
        int h=x/60;
        String result=h+"x:";
        if(m>10)
        {
            int q=m%10;
            int p=m/10;
            result+="c"+p+"a"+q+"egrz716b";
        }
        else {
            result+="c"+m+"aegrz716b";
        }
        return result;
    }
    public static String ArrayChallenge(int arr[])
    {
        String result="false";
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int x:arr) {
            list.add(x);
        }
        Integer max= Collections.max(list);
        list.remove(max);
        for (int x:list
             ) {
            sum+=x;
        }
        if(sum==max){
            return "true";
        }
        return result;
    }
}
