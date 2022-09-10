package Pratice;

import java.util.*;
public class MiniMum_No_Of_Platform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int start[]=new int[n];
        int end[]=new int[n];
        for (int i = 0; i < n; i++) {
            int s= sc.nextInt();
            int e=sc.nextInt();
            start[i]=s;
            end[i]=e;
        }
        System.out.println("Minimun No of station Required  :"+findMinStation(start,end,n));
    }
    public static int findMinStation(int arr[],int depa[],int n)
    {
        int ct=0;
        int minSta=0;
        int i=0,j=0;
        Arrays.sort(arr);
        Arrays.sort(depa);
        while (i<n)
        {
            if(arr[i]<=depa[j])
            {
                ct++;
                minSta=Math.max(minSta,ct);
                i++;
            } else if (arr[i]>depa[j]) {
                j++;
                ct--;
            }
        }
        return minSta;
    }
    static int findPlatform(int a[], int d[], int n)
    {
        // add your code here
        int ct=0,maxStation=0;
        Arrays.sort(a);
        Arrays.sort(d);
        int i=0,j=0;
        while(i<n)
        {
            if(a[i]<=d[j])
            {
                ct++;
                maxStation=Math.max(ct,maxStation);
                i++;
            }
            else if(a[i]>d[j])
            {
                ct--;
                j++;
            }
        }
        return maxStation;
    }
}
