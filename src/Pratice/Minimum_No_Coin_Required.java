package Pratice;
import java.util.*;
public class Minimum_No_Coin_Required {
    public static void main(String[] args) {

    }
    public static int minCoins(int coins[], int M, int V)
    {
        // Your code goes here
        int n=coins.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            while (V >= coins[i]) {
                V -= coins[i];
                ans.add(coins[i]);
            }
        }
        //System.out.println("The minimum number of coins is "+ans.size());
        return ans.size();
    }
}
