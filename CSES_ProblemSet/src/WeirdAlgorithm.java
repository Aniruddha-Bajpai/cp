import java.util.Scanner;
// https://cses.fi/problemset/task/1068/
public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        while(n!=1){
            System.out.print(n+ " ");
            if(n%2 == 0){
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
        }
        System.out.print(n);
    }
}
