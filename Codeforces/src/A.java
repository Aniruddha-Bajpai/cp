import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                int element = Integer.parseInt(br.readLine());
                arr.add(i,element);
            }
            int[] temp = new int[5001];
            int maxelement = 0;
            for(int i=0;i<n;i++){
                ++temp[arr.get(i)];
            }
            int maxelemnt = arr.get(0);
            int occuring = 0;
            for(int i=1;i<n;i++){
                if(arr.get(i)>occuring)
                    maxelement = i;
                occuring = (int)Math.max(occuring,arr.get(i));
            }

        }
    }
}
