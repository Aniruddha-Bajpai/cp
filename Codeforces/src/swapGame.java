import java.util.Scanner;
import static java.lang.Math.min;
public class swapGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;++i){
                arr[i] = scn.nextInt();
            }
            long small = Long.MAX_VALUE;
            for(int i=0;i<n;++i){
                small = min(small,arr[i]);
            }
            long first = arr[0];
            if(first==small) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
