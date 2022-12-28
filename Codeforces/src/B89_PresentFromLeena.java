import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B89_PresentFromLeena {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sp = n;
        int st = 1;
        for(int i = 0 ; i <= 2*n ; i++)
        {
            int str = 0;

            for(int j = 0 ; j < sp ; j++ ){
                System.out.print("  ");
            }
            for(int k=0 ; k<st ; k++) {
                System.out.print(str);
                if(k<st-1)
                    System.out.print(" ");
                if(k<(st)/2) str++;
                else str--;

            }
            System.out.println();
            if(i<n) {sp--;st+=2;}
            else {sp++;st-=2;}
        }
    }
}
