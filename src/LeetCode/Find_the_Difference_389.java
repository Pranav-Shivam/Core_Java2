package LeetCode;

public class Find_the_Difference_389 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(new Find_the_Difference_389().findTheDifference(s,t));
    }
    public char findTheDifference(String s, String t)
    {
        if (s.length()==0 && t.length()==1)
        {
            return t.charAt(0);
        }

        int sS=0,sT=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            sS+=(int)ch;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            sT+=(int)ch;
        }
        sS=sT-sS;
        System.out.println((char)sS);
        return ' ';
    }
}
