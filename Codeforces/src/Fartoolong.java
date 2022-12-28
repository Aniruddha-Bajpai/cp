import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fartoolong{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0 ;
        while(n--!=0){
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            if(str.length()>10){
                sb.append(str.charAt(0));
                sb.append(str.length()-2);
                sb.append(str.charAt(str.length()-1));
                System.out.println(sb.toString());
            }else{
                System.out.println(str);
            }
        }
        br.close();
    }
}