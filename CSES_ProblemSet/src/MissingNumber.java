import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n-1];
        int missing = 0;
        for(int i=0;i<n-1;i++) arr[i] = scn.nextInt();
        for(int i=1;i<=n;i++) missing ^= i;
        long all = n*(n+1)/2;
        for(int i=0;i<n-1;i++) missing ^= arr[i];
        System.out.println(missing);
    }
}
