package LeetCode;

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare_367().isPerfectSquare(121));
    }
    public boolean isPerfectSquare(int n)
    {

        if(Math.sqrt(n)==Math.floor(Math.sqrt(n)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
