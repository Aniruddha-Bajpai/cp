import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class bitland {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        while(n--!=0){
            String str = br.readLine();
            if(str.charAt(1) == '+')
                x++;
            else
                x--;

        }
        System.out.println(x);
    }
}
