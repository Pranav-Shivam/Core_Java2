package Revision_Question;

import java.util.*;
public class CountDistinctElement_In_Every_Window {
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=0,c=0;
        for(int i=0;i<n;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            c++;
            if(c==k){
                c=c-1;
                al.add(hm.size());
                if(hm.get(A[j])==1)
                    hm.remove(A[j]);
                else
                    hm.put(A[j],hm.get(A[j])-1);
                j++;
            }
        }


        return al;
    }
}
