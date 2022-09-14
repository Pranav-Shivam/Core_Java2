package Pratice;

import java.util.*;
public class AlterCase {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        String str1;
        System.out.println("Enter your String:");
        str1=cs.nextLine();
        str1=alter(str1);
        System.out.println(str1);
    }
    public static String alter(String s)
    {
        s=s.trim();
        char[] str=s.toCharArray();
        int j=0;

        for(int i=0;i<str.length;i++)
        {
            if(j%2==1){

                if(str[i]>64 && str[i]<91 )
                    str[i]=(char)((int)str[i]+32);
            }
            else{
                if(str[i]>96 && str[i]<123 )
                    str[i]=(char)((int)str[i]-32);
            }

            if(str[i]==' ')
            {
                continue;
            }
            j++;
        }
        String k="";

        for(int i=0;i<str.length;i++)
            k=k+str[i];
        return k;
    }
}
