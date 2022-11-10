package Pratice;

import java.util.ArrayList;
import java.util.*;

public class Colsur {
    public static void main(String[] args) {
        System.out.println(closureSum(6583));
    }
    public static int closureSum(int inputNum){
        int n=inputNum;
        int result=0;
        List<Integer> list=new ArrayList<>();
        while (n>0){
            int dig=n%10;
            list.add(dig);
            n=n/10;
        }
        Collections.reverse(list);
        int l=list.size();
        for (int i = 0; i < l/2; i++) {

            int x=list.get(i)*10+list.get(l-i-1);
            result+=x;

        }
        if (l%2!=0) {

            result=result+list.get(l/2);

        }
        return result;
    }
}
