package Pratice;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intput n
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int output[][] = mergeIntervals(arr);
        System.out.print("[");
        for (int[] interval : output
        ) {
            System.out.print(Arrays.toString(interval) + ",");
        }
        System.out.print("]");
    }

    public static int[][] mergeIntervals(int arr[][]) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval : arr) {
            if (list.size() == 0) {
                list.add(interval);
            } else {
                int prevInterval[] = list.get(list.size() - 1);
                if (prevInterval[1] > interval[0]) {
                    prevInterval[1] = Integer.max(prevInterval[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][2]);
    }

    public int[][] merge(int[][] intervals) {
        // Method 1: my implementation
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < intervals.length) {
            int tmpInterval[] = intervals[i];// take the intervals[0] to tmpInterval
            while (i < intervals.length - 1 && tmpInterval[1] >= intervals[i + 1][0]) {
                // create a tmpInterval that is merge of 2 consecutive intervals and check all subsequent intervals those can be merge to tmpInterval
                tmpInterval[0] = Math.min(tmpInterval[0], intervals[i + 1][0]);
                tmpInterval[1] = Math.max(tmpInterval[1], intervals[i + 1][1]);
                i = i + 1;
            }
            result.add(tmpInterval);
            i = i + 1;
        }
        return result.toArray(new int[result.size()][2]);
    }
}
