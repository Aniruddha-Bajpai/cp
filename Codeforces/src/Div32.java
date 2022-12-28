import java.util.Scanner;

public class Div32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n-->0){
            int m = scn.nextInt();
            int s = scn.nextInt();
            int[] a = new int[m];
            for(int i=0;i<m;++i) a[i] = scn.nextInt();
            int[] count = new int[1001];
            for(int i=0;i<m;++i){
                ++count[a[i]];
            }
            String ans = "Yes";
            int sum = 0;
            for(int i=1;i<=1000;++i){
                if(count[i]<1) {
                    count[i]++;
                    sum += i;
                }
                if(sum==s || sum>s) break;
            }
            if(sum==s) ans = "Yes";
            else ans = "No";
            for(int i=1;i<=m;++i){
                if(count[i]<1) ans = "No";
            }
            System.out.println(ans);
        }
    }
}
