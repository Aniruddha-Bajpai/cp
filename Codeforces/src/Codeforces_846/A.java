package Codeforces_846;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++) arr[i] = scn.nextInt();
            int count = 0;
            for(int i=0;i<n;i++) count += arr[i]%2;
            if(count < 3 && ((n-count)<2) || count == 0) System.out.println("NO");
            else{
                System.out.println("YES");
                if(count >= 3) {
                    int rem = 3;
                    for(int i=0;i<n;i++) {
                        if(arr[i]%2 != 0 && rem != 0){
                            System.out.print(i+1 + " ");
                            rem --;
                        }
                    }
                } else {
                    int rem_0 = 2, rem_1 = 1;
                    for(int i=0; i<n; i++) {
                        if(arr[i]%2 != 0 && rem_1 != 0){
                            System.out.print(i+1 + " ");
                            rem_1--;
                        } else if(arr[i]%2 == 0 && rem_0 != 0){
                            System.out.print(i+1 + " ");
                            rem_0--;
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
