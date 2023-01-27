import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C_847_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int s = scn.nextInt();
            int r = scn.nextInt();
            int mxElement = s - r;
            int rem = (r%(n-1));
            int mid = (r/(n-1));
            System.out.print(mxElement+" ");
            for(int i=1;i<n;i++){
                if(rem > 0){
                    System.out.print((mid+1) + " ");
                    rem--;
                } else System.out.print(mid + " ");
            }
            System.out.println();

        }
    }
//    private static boolean generateSequence(int n, int currentDiceNumber, int target, List<Integer> result){
//        if(target == 0 && currentDiceNumber == n){
//            return true;
//        }
//        if(target < 0 || currentDiceNumber>n) return false;
//
//        for(int i=1;i<=6;i++){
//            if(i<=target){
//                result.add(i);
//                if(generateSequence(n, currentDiceNumber+1, target-i, result)) return true;
//                result.remove(result.size()-1);
//            }
//        }
//        return false;
//    }
}
