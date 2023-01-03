package Pratice;

import java.util.*;

public class SortOnBasicOfLength {
    public static void main(String[] args) {

    }
    public static void sortArr(String A[])
    {
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            arr.add(A[i]);
        }
        arr.sort((a, b) -> {
            if (a.length() < b.length()) return -1;
            if (a.length() > b.length()) return 1;
            if (a.compareTo(b) < 0) return -1;
            if (a.compareTo(b) > 0) return 1;
            return 0;
        });
    }
}
