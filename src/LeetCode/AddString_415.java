package LeetCode;

public class AddString_415 {
    public static void main(String[] args) {
        String num1 =
                "6913259244",
                num2 =
                        "71103343";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            int n1 = (i < 0) ? 0 : num1.charAt(i) - '0';
            int n2 = (j < 0) ? 0 : num2.charAt(j) - '0';

            int sum = n1 + n2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
        if (carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
