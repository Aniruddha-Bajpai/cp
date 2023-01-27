import java.util.Scanner;
import static java.lang.Math.max;
public class Repeatation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++) arr[i] = scn.nextInt();
        String str = scn.next();
        String  mxRepstr = "";
        int mxReplen = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'A' || ch == 'C' || ch == 'G' || ch == 'T'){
                if(mxRepstr.length() > 0 && mxRepstr.charAt(mxRepstr.length()-1) == ch) {
                    mxReplen = (int)max(mxRepstr.length(), mxReplen);
                }
                else{
                    mxRepstr = "";
                } mxRepstr += ch;
            } else mxRepstr = "";
        }
        System.out.println(mxReplen+1);
    }
}
