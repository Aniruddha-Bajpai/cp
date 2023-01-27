import java.util.Scanner;

public class C_847 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            String s = scn.next();
            if(s.charAt(0) != '3'){
                System.out.println(0);
            } else {
                String pi_ = "314159265358979323846264338327";
                int i =0;
                while(i < s.length() && pi_.charAt(i) == s.charAt(i)){
                    i++;
                } System.out.println(i);
            }
        }
    }
}
