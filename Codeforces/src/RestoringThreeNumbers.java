import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args)throws IOException {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[4];
        int indx=0 ;
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            a[i] = scn.nextInt();
            if(lar<a[i]) {
                lar = a[i];
                indx = i;
            }
        }
        for(int i=0;i<4;i++){
            if(indx!=i)
            System.out.print(lar-a[i]+" ");
        }
    }
}
