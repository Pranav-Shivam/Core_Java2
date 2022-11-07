package Pratice;

public class Quadplet {
    public static int validQuadruples(int n,int arr[])
    {
        int result=-404;
        if(n<=2)
        {
            return result;
        }
        int ct=0;
        for (int i = 2; i <n-1 ; i++) {
            int a=arr[i-2]+arr[i-1];
            int b=arr[i]+arr[i+1];
            if(a==b)
            {
                ct++;
            }
        }
        return ct;
    }

    public static void main(String[] args) {
        int arr[]={
                2,3,1,4,0
        };
        System.out.println(validQuadruples(arr.length,arr));
    }
}
