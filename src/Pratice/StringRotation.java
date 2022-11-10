package Pratice;

public class StringRotation {

    public static void main(String[] args) {
        String s = "Pranav Shivam";
        String str[] = s.split("\\s");
        int max = Integer.MIN_VALUE;
        String s1="";
        for (String a : str) {
           s1=s1+" "+rotateString(a,"L2");

        }
        System.out.println(s1.trim());
    }
    public static String rotateString(String s,String h)
    {
        String s1="";
        char c=h.charAt(0);
        String r=h.substring(1,2);
//        System.out.println(c+" "+r);
        int rr=Integer.parseInt(r);
        if(c=='L')
        {
            s1=s.substring(rr)+s.substring(0,rr);
        }
        if(c=='R')
        {
            s1=s.substring(s.length()-rr)+s.substring(0,s.length()-rr);
        }
        return s1;//8882132132
    }

}
