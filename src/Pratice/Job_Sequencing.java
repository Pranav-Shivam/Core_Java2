package Pratice;

import java.util.*;
public class Job_Sequencing {

    public static void main(String[] args) {
        Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
        //function call
        int[] res = jobScheduling(arr, 4);
        System.out.println(res[0] + " " + res[1]);
        //jobScheduling(arr,4);
    }
    public static int[] jobScheduling(Job[] jobs,int n)
    {
        
        Arrays.sort(jobs,(a,b)->(b.profit- a.profit));
        int ddLn=0;
        for (Job j:jobs) {
            ddLn=Math.max(ddLn,j.deadline);
        }
        int maxProfit=0;
        int ctJob=0;
        int result[]=new int[ddLn+1];
        for (int i = 0; i <=ddLn; i++) {
            result[i]=-1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <jobs[i].deadline; j++) {
                if (result[j] == -1) {
                    result[j] = i;
                    ctJob++;
                    maxProfit += jobs[i].profit;
                    break;
                }
            }
        }
        return new int[]{ctJob,maxProfit};
        //return result;
    }
}
class Job
{
    int id;
    int deadline;
    int profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
