import java.util.Scanner;

public class Creating_Expression {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long target = scn.nextLong();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) arr[i] = scn.nextLong();
        boolean output = isPossible(arr, 1, target-arr[0]);
        if(output) System.out.println("YES");
        else System.out.println("NO");
    }
    private static boolean isPossible(long[] nums, int current, long target){
        if(current == nums.length && target == 0) return true;
        if(current == nums.length && target != 0) return false;
        boolean positiveSign = isPossible(nums, current+1,target - nums[current]);
        boolean negativeSign = isPossible(nums, current+1,target + nums[current]);
        return positiveSign|negativeSign;
    }
}
