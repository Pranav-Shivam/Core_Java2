package Pratice;

public class Nth_Root_Of_a_No {
    public static void main(String[] args) {
        System.out.println(findNthRootOfN(4,69));
    }
    public static double findNthRootOfN(int n, int m) {
        // Write your code here.
        double k=Math.pow(m,1.0/(double) n);
        return k;
    }
}
