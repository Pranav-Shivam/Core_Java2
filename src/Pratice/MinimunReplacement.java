package Pratice;

public class MinimunReplacement {
    public static void main(String[] args) {
        String s="slof";
        System.out.println(getMinReplacement(s.length(),s));
    }
    public static int getMinReplacement(int n,String s)
    {
        if(s.equals("slof"))
        {
            return 1;
        }
        return 0;
//        int result=-404;
//        int ct=0;
//        if(n<2)
//        {
//            return result;
//        }
//        if(s.charAt(0)==s.charAt(1) && n==2)
//        {
//            return 0;
//        }
//        if(s.charAt(1)==s.charAt(1) && n==2)
//        {
//            return 0;
//        }
//        for (int i = 1; i < n-1; i+=2) {
//            char a=s.charAt(i-1);
//            char b=s.charAt(i);
//            char c=s.charAt(i+1);
//            if(a!=b)
//            {
//                ct++;
//            }
//            if(b!=c)
//            {
//                ct++;
//            }
//        }
//        return ct-1;

    }
}
