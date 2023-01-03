package Pratice;

public class PrintFibboSeriesInRange {
    public static void main(String[] args) {

    }

    public static void fibbo(int a,int b,int n) {

        if(n==0) {                          //if(n==0)
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibbo(b,c,n-1);                       //fibbo(a,b,n-1)
    }
}
