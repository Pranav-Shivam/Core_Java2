package Pratice;

public class NthPrimeNo {
    public static void main(String[] args) {
        System.out.println(MathChallenge(100));
    }

    public static int MathChallenge(int num) {

        int i = 2;

        while (num > 0) {


            if (isPrime(i) == 1)
                num--;

            i++;
        }
        i -= 1;
        return i;
    }

    static int isPrime(int k) {


        if (k <= 1)
            return 0;
        if (k == 2 || k == 3)
            return 1;


        if (k % 2 == 0 || k % 3 == 0)
            return 0;

        for (int i = 5; i * i <= k; i = i + 6)
            if (k % i == 0 || k % (i + 2) == 0)
                return 0;

        return 1;
    }

}
