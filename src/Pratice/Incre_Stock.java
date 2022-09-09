package Pratice;

import java.util.*;
import java.util.Scanner;

public class Incre_Stock {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int l=sc.nextInt();
//        int arr[]=new int[l];
//
//        for (int i=0;i<l;i++)
//        {
//            arr[i]= sc.nextInt();
//        }

        int ar[] = {70, 40, 50, 60};
        inceSt(ar);
    }

    public static void inceSt(int arr[]) {

        int l = arr.length;
        int res[] = new int[l];
        for (int i = 0; i < l; i++) {

        }
        for (int i = 0; i < l; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code
        List<Long> list = new ArrayList<>();
        Stack<Long> s = new Stack<>();
        long[] ans = new long[n];

        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty())
                list.add((long) -1);
            else if (s.peek() > arr[i])
                list.add(s.peek());
            else if (s.peek() <= arr[i]) {
                while (!s.isEmpty() && s.peek() <= arr[i]) s.pop();
                if (s.isEmpty()) list.add((long) -1);
                else list.add(s.peek());
            }
            s.push(arr[i]);
        }

        int i = 0;
        while (!list.isEmpty()) {
            ans[i] = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            i++;
        }
        return ans;
    }
}
