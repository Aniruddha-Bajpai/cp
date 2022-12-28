import java.util.Scanner;

public class BanBan {
    public static void main(String[]str){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            long n = scn.nextLong();
            long count = (n+1)/2;
            System.out.println(count);
            for(long i=0;i<count;++i){
                System.out.println(i*3+1 +" "+(n*3-(i*3+1)+1));
            }
        }
    }
}