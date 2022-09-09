package Pratice;

import java.util.*;

public class Sort_2D_Array {
    public static void main(String[] args) {

    }
    public static void sort(int arr[][])
    {
        //sorting array in accending order on the basis of 0'th column
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        //sorting array in decending order on the basis of 0'th column
        Arrays.sort(arr,(a,b)->Integer.compare(b[0],a[0]));

        //sorting array in accending order on the basis of 1'th column
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));

        //sorting array in decending order on the basis of 1'th column
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
    }
}
