import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        String newstring = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='a'||str.charAt(i)=='u'||str.charAt(i) == 'y'){
                continue;
            }
            else{
                newstring += "."+str.charAt(i);
            }
        }
        System.out.println(newstring);
    }
}
