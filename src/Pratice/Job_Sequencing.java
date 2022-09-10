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
        int[] res = JobScheduling(arr, 4);
        System.out.println(Arrays.toString(res));
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
    // best Approach
    static int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a, b) -> b.profit - a.profit);
        int []ans=new int[2];
        int maxDeadLine=arr[0].deadline;
        for(int i=1;i<n;i++)
        {
            if(arr[i].deadline>maxDeadLine){
                maxDeadLine=arr[i].deadline;
            }
        }
        boolean visited[]=new boolean[maxDeadLine];
        for(int i=0;i<n;i++)
        {
            if(visited[arr[i].deadline-1]==false){
                visited[arr[i].deadline-1]=true;
                ans[0]++;ans[1]+=arr[i].profit;
            }
            else
            {
                for(int j=arr[i].deadline-1;j>=0;j--)
                {
                    if(visited[j]==false)
                    {
                        visited[j]=true;
                        ans[0]++;
                        ans[1]+=arr[i].profit;
                        break;
                    }
                }
            }
        }
        return ans;
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
