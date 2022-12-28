import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dangerousORsafe77A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean flag = false;
        String[] team1 = str.split("1");
        String[] team2 = str.split("0");
        for(String ele: team1){
            if(ele.length()>=7){
                flag = true;
            }
        }
        for(String ele : team2){
            if(ele.length()>=7){
                flag = true;
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
