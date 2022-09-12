package Revision_Question;

import java.util.*;
public class ValidBrackets {
    public static void main(String[] args) {
        System.out.println(isValidBraces("{[]}"));
    }
    public static boolean isValidBraces(String s)
    {
        if(s==null||s.length()==0)
        {
            return true;
        }
        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()) {
            if(ch=='}'||ch==']'||ch==')')
            {
                if(st.empty())
                {
                    return false;
                }
                char c=st.pop();
                if (!isValid(c,ch))
                {
                    return false;
                }
            }
            else
            {
                st.push(ch);
            }
        }
        return st.empty();
    }
    public static boolean isValid(char left,char right)
    {
        if(left=='{' && right=='}')
        {
            return true;
        }
        if(left=='(' && right==')')
        {
            return true;
        }
        if(left=='[' && right==']')
        {
            return true;
        }
        return false;
    }
}
