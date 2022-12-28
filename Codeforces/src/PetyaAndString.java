import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        br.close();
        int result = str1.compareToIgnoreCase(str2) ;
        result = Integer.compare(result, 0);
        System.out.println(result);
    }
}
