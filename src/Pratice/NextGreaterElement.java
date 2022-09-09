package Pratice;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {
                70, 40, 50, 60
        };
        //solve_NGE(arr);
        nextGreaterEleIndex(arr);
    }

    public static void solve_NGE(int arr[]) {
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }

        System.out.println(Arrays.toString(nge));
    }
    public static void nextGreaterEleIndex(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i );
        }
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        int ngei[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(nge[i]))
            {
                ngei[i]=map.get(nge[i]);
            }
            else
            {
                ngei[i]=-1;
            }
        }
        System.out.println(Arrays.toString(nge));
    }
    //leetCode Greater element in any direction
    public static int[] greaterEleInBothDirection(int arr[])
    {
        int n= arr.length;

        Stack<Integer> st= new Stack<>();
        int []ans= new int[n];

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty()&& st.peek()<=arr[i])st.pop();
            st.push(arr[i]);
        }

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i])st.pop();
            ans[i]=  st.isEmpty()? -1: st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}
