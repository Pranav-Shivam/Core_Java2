package Pratice;

import java.util.Scanner;

public class DigitSumSwap {
    public static void swap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no whic u want to swap");
        System.out.println("ENter the 1 no");
        int n1=sc.nextInt();
        System.out.println("ENter the 2 no");
        int n2=sc.nextInt();
        System.out.println("The No.s before swapping : "+n1+"  and  "+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("The No.s after swapping : "+n1+"  and  "+n2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the 1 no");
        int n=sc.nextInt();
        if(n%11==0)
        {
            System.out.println("Foo");
        }
        else if(n%17==0)
        {
            System.out.println("Bar");
        }
        else if(n%11==0 && n%17==0)
        {
            System.out.println("Foo bar");
        }
        else
        {
            System.out.println("Wrong Choicer");
        }
    }
    public static void sumOf()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the 1 no");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("The sum of the digit : "+sum);
    }
}
