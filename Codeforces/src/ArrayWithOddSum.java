import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t--!=0){
            int n = scn.nextInt();
            int[]a = new int[n];
            int sum = 0;
            for(int i = 0 ; i<n ;i++){
                a[i] = scn.nextInt();
            }
            for(int el : a)
                sum += el;
            if(sum % 2 != 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        scn.close();
    }
}
