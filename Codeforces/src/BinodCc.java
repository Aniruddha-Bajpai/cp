import java.util.Scanner;

public class BinodCc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int q = scn.nextInt();
            long[][] a = new long[64][n];
            for(int i=0;i<n;++i){
                long element = scn.nextLong();
                for(int j=0;j<64;++j){
                    a[j][i] = (element%2);
                    element/=2;
                }
            }
            for(int i=0;i<64;++i){
                long cnt = 0;
                for(int j=0;j<n;++j){
                    cnt += a[i][j];
                    a[i][j] = cnt;
                }
            }
            while(q-->0){
                int k = scn.nextInt();
                int l1 = scn.nextInt();
                int r1 = scn.nextInt();
                int l2 = scn.nextInt();
                int r2 = scn.nextInt();
                l1--;r1--;l2--;r2--;
                int sizeLeft = r1-l1+1;
                int sizeRight = r2-l2+1;
                long tub = 0,tsb = 0;
                if(l1==0) {
                    tub = a[k][r1];
                }else tub = a[k][r1]-a[k][l1-1];
                if(l2==0){
                    tsb = a[k][r2];
                }
                else tsb = a[k][r2]-a[k][l2-1];
                long sum = ((sizeLeft-tub)*(tsb)) +
                        (tub*(sizeRight-tsb));
                System.out.println(sum);
            }
        }
    }
}
