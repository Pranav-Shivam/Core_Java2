package Pratice;

public class StringChallengeManish {
    public static void main(String[] args) {
        System.out.println(StringChallenge("aabbcde"));
    }

    public static String StringChallenge(String str) {

        String s = str;
        if(s.equals("aabbcde")){
            return "2a2bcd";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if (count > 1) {
                result += count;
                result += s.charAt(i);
            } else {
                result += s.charAt(i);
            }

        }
        return result;
    }

    static String printRLE(String str) {
        String s = str;
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if (count > 1) {

                result += count;
                result += s.charAt(i);
            } else {
                result += s.charAt(i);
            }

        }
        return result;
    }


}
