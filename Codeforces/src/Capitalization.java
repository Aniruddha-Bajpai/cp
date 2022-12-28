import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Capitalization {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String str = br.readLine();
          br.close();
          String k = (char)(str.charAt(0)<97?str.charAt(0):str.charAt(0)-32) + str.substring(1);
          System.out.println(k);
     }
}
