package Codeforces_832;

import java.util.Scanner;
import static java.lang.Math.*;
public class TwoGroups {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            long[] a = new long[n];
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                a[i] = scn.nextLong(); sum+=a[i];
            }
            System.out.println(abs(sum));
        }
    }
}
