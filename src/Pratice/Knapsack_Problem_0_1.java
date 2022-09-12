package Pratice;

public class Knapsack_Problem_0_1 {
    public static void main(String[] args) {
        int k=4;
        int n=3;
        int values[] = {1,2,3};
        int weight[] = {4,5,1};
        System.out.println(knapsack(k,weight,values,n));
    }
    public static  int knapsack(int k,int wt[],int val[],int n)
    {
        int sack[][]=new int[n+1][k+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < k+1; j++) {
                if(i==0||j==0)
                {
                    sack[i][j]=0;
                }
                else if(wt[i-1]<=j)
                {
                    sack[i][j]=Math.max(val[i-1]+sack[i-1][j-wt[i-1]],sack[i-1][j]);
                }
                else {
                    sack[i][j]=sack[i-1][j];
                }
            }
        }
        return sack[n][k];
    }
}
