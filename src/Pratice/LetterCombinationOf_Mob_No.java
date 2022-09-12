package Pratice;
import java.util.*;
public class LetterCombinationOf_Mob_No {
    public static void main(String[] args) {

    }
    public List<String> letterCombinations(String d) {
        List<String> list=new ArrayList<>();
        if(d==null)
        {
            return list;
        }
        int n=Integer.parseInt(d);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        ArrayList<Integer> dig=new ArrayList<>();
        while (n!=0)
        {
            int r=n%10;
            dig.add(r);
            n=n/10;
        }
        Collections.reverse(dig);

        return list;
    }
}
