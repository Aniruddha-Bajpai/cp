import java.util.Scanner;

public class div33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            long lt = scn.nextLong();
            long rt = scn.nextLong();
            long xms = scn.nextLong();
            long ta = scn.nextLong();
            long tb = scn.nextLong();
            if(ta==tb) {
                System.out.println(0);
                continue;
            }
            if(!(tb>=lt && tb<=rt)) System.out.println(-1);
            if(ta<tb){
                if((ta+xms==tb)||(ta+xms<tb)) System.out.println(1);
                else if ((tb+xms<=rt) || (ta-xms>=lt)) System.out.println(2);
                else if((tb-lt>=xms)&&(ta+xms<=rt)) System.out.println(3);
                else System.out.println(-1);
                continue;
            }
            if((ta-xms==tb) || (ta-xms>tb)) System.out.println(1);
            else if ((tb-xms>=lt )|| (ta+xms<=rt)) System.out.println(2);
            else if((rt-tb>=xms) && (ta-xms)>=lt)System.out.println(3);
            else System.out.println(-1);
        }

    }
}
