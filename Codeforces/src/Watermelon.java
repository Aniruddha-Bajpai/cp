import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Watermelon {
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        if(n>2 && n%2 != 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
