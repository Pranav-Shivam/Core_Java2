package Pratice;

import java.util.*;

public class Fountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int sp = 1; sp <i; sp++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                if(j==i){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = n-1; j >=i ; j--) {
                if(j==i){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        n=n-1;
        int ct=1;
        for (int i = n; i >=1 ; i--) {
            for (int sp = i-1; sp >=i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if(i==j){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int sp2 = 1; sp2 <=ct; sp2++) {
                System.out.print(" ");
            }
            for (int j = n; j >=1 ; j--) {
                if(i==j){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            ct++;
            System.out.println();
        }
    }

}
