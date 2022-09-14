package Pratice;
import java.util.*;
public class CodeDecode {
    public static void main(String[] args) {
        String s="12";

            int k=CountWays(s);
            System.out.println(k);


    }
    public static int decode(String s)
    {
        Character ch='A';
        int ct=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 1; i <=26 ; i++) {

        }
        return ct;
    }
    static int mod = 1000000007;
    static int decodeMessage(int[] dp, int s, String str, int n)
    {

        if(s >= n)
            return 1;

        if(dp[s] != -1)
            return dp[s];

        int num,tc;
        num = tc = 0;
        for(int i=s;i<n;i++)
        {

            num = num*10 + ((int)str.charAt(i) - '0');

            if(num >= 1 && num <= 26)
            {

                int c = decodeMessage(dp, i + 1, str, n);

                tc = (tc%mod + c%mod)%mod;
            }

            else
                break;
        }

        return (dp[s] = tc);
    }
    static int CountWays(String str)
    {
        int n = str.length();

        if(n == 0)
            return 1;

        int[] dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = -1;
        }

        return decodeMessage(dp,0,str,n);
    }

}
