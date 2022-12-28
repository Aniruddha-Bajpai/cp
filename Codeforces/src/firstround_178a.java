import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class firstround_178a {
    public static void main(String[] args)throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ;i<n ;i++){
            a[i] = scn.nextInt();
        }
        scn.close();
        int count = 0;
        for(int i = 0 ; i<n ;i++){
            if(a[i]>=a[m-1] && a[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
