import java.util.Scanner;

public class Div_847_D {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n =  scn.nextInt();
            if(((n/2)&n) != 0) System.out.println(-1);
            else if(n%2 != 0) System.out.println(-1);
            else System.out.println(((n*6)/4) + " " + (n/2));
        }
    }
}
