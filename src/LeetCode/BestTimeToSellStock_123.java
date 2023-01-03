package LeetCode;

public class BestTimeToSellStock_123 {
    public int maxProfit(int[] prices) {
        int max1=0, max2=0;
        int lowestPrice1=Integer.MAX_VALUE, lowestPrice2=Integer.MAX_VALUE;
        for(int p: prices){
            lowestPrice1=Math.min(lowestPrice1, p);
            max1=Math.max(max1, p-lowestPrice1);
            lowestPrice2=Math.min(lowestPrice2, p-max1);
            max2=Math.max(max2, p-lowestPrice2);
        }
        return max2;
    }
}
