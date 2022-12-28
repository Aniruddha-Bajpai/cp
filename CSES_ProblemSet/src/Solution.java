import java.util.*;
import java.io.*;

public class Solution {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static long n = in.nextLong();
    public static void main(String[] args)  {
        while(n!=1){
            System.out.printf("%d ",n);
            if(n%2 == 0)
                n /= 2;
            else
                n = n*3 +1;
            if(n==0)
                break;
        }
    }
    static class FastReader{
        public FastReader(){
            br= new BufferedReader( (new InputStreamReader(System.in)));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
}
