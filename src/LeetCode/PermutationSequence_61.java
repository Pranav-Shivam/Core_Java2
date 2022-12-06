package LeetCode;
import java.util.*;
public class PermutationSequence_61 {
    public static void main(String[] args) {

    }
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int sum = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i ++) {
            sum *= i;
            list.add(i);
        }
        while (!list.isEmpty()) {
            int idx = (k - 1) / (sum / n);
            sb.append(list.remove(idx));
            k -= idx * (sum / n);
            sum /= n;
            n --;
        }
        return sb.toString();
    }
}
