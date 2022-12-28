import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Div3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n-->0){
            String str = scn.next();
            String pat = "YesYes";
            int j = 0;
            String ans = "Yes";
            while(j<pat.length() && str.charAt(0)!=pat.charAt(j)) j++;
            for(int i=0;i<str.length();){
                j%=pat.length();
                if(str.charAt(i)==pat.charAt(j)){
                    ans = "Yes";
                    i++;j++;
                }else {
                    ans = "No";
                    break;
                }
            }System.out.println(ans);
        }
    }
}
