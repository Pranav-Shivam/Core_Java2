package LeetCode;

public class Num_To_Hex_405 {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] map = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0, map[num & 0b1111]);
            num = num >>> 4;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(new Num_To_Hex_405().toHex(193));
        System.out.println(toHexa(255));
    }

    public static String toHexa(int n) {
        StringBuffer str = new StringBuffer();
        char arr[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if(n<256)
        {
            int x = n / 16;
            int y = n % 16;
            str.append(arr[x - 1]);
            str.append(arr[y - 1]);
        }

        return str.toString();
    }
}
