import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.Math.min;
public class MinimizingCoins {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long amt = scn.nextLong();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) arr[i] = scn.nextLong();
//        if(n==1) System.out.println(amt/arr[0]);
//        else{
//            long res = minimumCoins(arr, 0, amt, new HashMap<>());
//            if(res == 1000001) System.out.println(-1);
//            else System.out.println(res);
//        }
        System.out.println(minimumCoins(arr, amt));
    }
    private static long minimumCoins(long[] coins, long amount){

        long[] dp = new long[(int)(amount+1)];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        long mx = amount+1;
        for(int i=1;i<=amount;++i){
            for(int j=0;j<coins.length;++j){
                if(coins[j]<=i){
                    dp[i] = min(dp[i],dp[i-(int)coins[j]]+1);
                }
            }
        }
        return dp[(int)amount]>amount?-1:dp[(int)amount];
    }
}
