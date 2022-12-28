import java.util.Scanner;

public class KevinAndPermute {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int c = n/2+1;
            int q = 1;
            for(int i=1;i<=n/2;++i){
                System.out.print(c+" "+q+" ");
                c++;q++;
            }
            if(n%2!=0)
                {
                    System.out.print(c);
                    System.out.println();
                }
            }
        }
    }
