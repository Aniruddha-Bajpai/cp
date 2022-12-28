import java.util.Scanner;
import static java.lang.Math.*;
public class UltimateSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        while(t-->0){
            long n = scn.nextLong();
            System.out.println((long)ceil(n/2.0));
        }
    }
}
