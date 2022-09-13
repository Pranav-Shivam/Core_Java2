package Pratice;

import java.util.*;

public class Matrix_Median {
    public static void main(String[] args) {

    }

    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        int m = 0;
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> li = matrix.get(i);
            list.addAll(li);
        }
        Collections.sort(list);
        m = list.size() / 2;

        return list.get(m);
    }


}
