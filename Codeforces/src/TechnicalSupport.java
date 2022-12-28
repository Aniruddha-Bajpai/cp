import java.util.Scanner;
import static java.lang.Math.*;
public class TechnicalSupport {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n =scn.nextInt();
            String msg = scn.next();
            int qcnt = 0;
            int acnt = 0;
            for(char ch : msg.toCharArray()){
                qcnt = (ch == 'Q')?qcnt+1:(int)max(0,qcnt-1);
            }
            if(qcnt==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
//    contest 829 div 2 ques- 1
}
