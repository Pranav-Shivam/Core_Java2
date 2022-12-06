package LeetCode;

public class ValidNumber_65 {
    public static void main(String[] args) {

    }
    public boolean isNumber(String s) {
        try{
            Double x = Double.parseDouble(s); //is this possible?
        }catch(NumberFormatException e){ //no return false
            return false;
        }finally{
            if (s.matches(".*[a-dA-D].*") || s.matches(".*[f-zF-Z].*")) {
                return false; //maybe check if it does contain a character other than e
            }
        }
        return true;
    }
}
