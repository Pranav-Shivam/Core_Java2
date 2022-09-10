package Pratice;

import java.util.*;
public class N_Meeting_In_Room {
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
        System.out.println("Maximun Meeting can be held :"+meeting(start,end,n));
    }
    public static int meeting(int start[],int end[],int n)
    {
        int ct=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[2]==b[2])?a[0]-b[0]:a[2]-b[2]);
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{(i+1),start[i],end[i]});
        }
        int limit=0;
        while (!pq.isEmpty())
        {
            int cur[]=pq.poll();
            if(cur[1]>limit)
            {
                limit=cur[2];
                ct++;
            }
        }
        return ct;
    }
}
