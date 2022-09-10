package Revision_Question;

public class CountMaxRepeating_1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 0,0,0,0,0 ,1, 1, 1, 1};
        int ct=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1)
            {
                ct++;
                max=Math.max(ct,max);
            }
            else
            {
                max=Math.max(ct,max);
                ct=0;
            }
        }
        System.out.println(max);
    }
}
