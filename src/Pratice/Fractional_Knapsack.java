package Pratice;

import java.util.*;
public class Fractional_Knapsack {
    public static void main(String[] args) {
        int N = 2, W = 50,
        values[] = {60,100},
        weight[] = {10,20};
        System.out.println(fracctional_Knapsack(weight,values,W,N));
    }
    public static double fracctional_Knapsack(int wt[],int val[],int K,int n)
    {
        TreeMap<Double,ArrayList<Integer>> map=new TreeMap<>(Collections.reverseOrder());
        double sack=0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list=new ArrayList<>();
            double v=val[i];
            double w=wt[i];
            double r=v/w;
            list.add(0,(int)v);
            list.add(1,(int)w);
            map.put(r,list);
        }
        //System.out.println(map);
        ArrayList<Integer> wei=new ArrayList<>();
        ArrayList<Integer> valu=new ArrayList<>();
        int i=0;
        for(Map.Entry knap:map.entrySet())
        {
            ArrayList<Integer> li=(ArrayList<Integer>) knap.getValue();
            valu.add(i,li.get(0));
            wei.add(i,li.get(1));
            //System.out.println(li);
        }
        Collections.reverse(valu);
        Collections.reverse(wei);
        int currWeight=0;
        for (i = 0; i <n ; i++) {
            if(currWeight+wei.get(i)<=K)
            {
                currWeight=currWeight+wei.get(i);
                sack=sack+valu.get(i);
            }
            else {
                int rem=K-currWeight;
                sack+=((double)valu.get(i)/(double) wei.get(i))*(double)rem;
                break;
            }
        }
        return sack;
    }
}
