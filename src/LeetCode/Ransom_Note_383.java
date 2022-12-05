package LeetCode;

import java.util.*;
public class Ransom_Note_383 {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {

        //Base case: if either ransomnote or both ransomNote and magazine is empty, return true
        if(ransomNote.length()==0 || ransomNote.length()==0 && magazine.length()==0 )
            return true;

        //if magazine is empty, return false
        if(magazine.length()==0)
            return false;

        //General case: if both ransomNote and magazine are not null
        //hashmap to store characters in ransomnote
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for(int i=0;i<ransomNote.length();i++)
        {
            if(map.containsKey(ransomNote.charAt(i)))
            {
                int value=map.get(ransomNote.charAt(i));
                map.put(ransomNote.charAt(i),++value);
            }
            else
                map.put(ransomNote.charAt(i),1);
        }

        for(int i=0;i<magazine.length();i++)
        {
            if(map.containsKey(magazine.charAt(i)))
            {
                int value=map.get(magazine.charAt(i));

                if(value==1)
                {
                    map.remove(magazine.charAt(i));
                }
                else
                {

                    map.put(magazine.charAt(i),--value);
                }

                if(map.isEmpty())
                    return true;
            }
        }

        return false;

    }
}
