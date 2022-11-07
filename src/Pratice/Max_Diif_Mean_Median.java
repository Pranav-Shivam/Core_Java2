package Pratice;

import java.util.*;
public class Max_Diif_Mean_Median {
    public static void main(String[] args) {
        int[] input2=
                {2,3,2,1,3};
//          {1,3,2,4};
        Arrays.sort(input2);
        int x=input2.length;
        int[] outp=meanMedian(x,input2);
        for(int e:outp) {
            System.out.print(e+"\t");
        }
    }

    public static int[] meanMedian(int input1, int[] input2) {
        double median=findMedian(input2);
        double mean=findMean(input2);
        double diff=median-mean;
        int MAXINDEX=0;
        int n=input1;
        double sets=(1<<n);
        for(int i=1;i<=sets;i++) {
            int[] subset=findSubset(i,input2);
            mean=findMean(subset);
            median=findMedian(subset);
            if(mean -median>diff) {
                diff=mean-median;MAXINDEX=i;
            }
        }
        
        return findSubset(MAXINDEX,input2);
    }
    public static int[] findSubset(int counter, int[] input2) {
        int n=input2.length;
        List<Integer> ls=new ArrayList<>();
        for(int j=0;j<n;j++) {
            if((counter & (1<<j))>0) {
                ls.add(input2[j]);
            }
        }
        int[] output= new int[ls.size()];
        for(int j=0;j<ls.size();j++) {
            output[j]=ls.get(j);
        }
        return output;
    }

    public static double findMean(int[] input2) {
        int n=input2.length;
        double sum=0;
        if(n==0) return 0;
        for(int i=0;i<n;i++)
            sum +=input2[i];
        return (sum/n);
    }

    public static double findMedian(int[] input2) {
        int n=input2.length;
        if(n%2==1)
            return input2[(n/2)];
        else if(n>=2)
            return 0.5*(input2[((n-2)/2)]+input2[n/2]);
        else return 0;
    }
}