package Revision_Question;

public class Ternary_3_var_largest {
    public static void main(String[] args) {
        int a=7;
        int b=5;
        int c=6;
        System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));
    }
}
