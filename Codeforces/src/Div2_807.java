//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Div2_807 {
//    public static void main(String[] args)throws IOException
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        while(t-->0){
//            int n = Integer.parseInt(br.readLine());
//            int x = Integer.parseInt(br.readLine());
//            int[] arr = new int[2*n];
//            for(int i=0;i<(2*n);i++){
//                arr[i] = Integer.parseInt(br.readLine());
//            }
//            int idx = (2*n)/2;
//            int i;
//            for(i=0;i<n;i++){
//                if(arr[i]>=arr[idx]){
//                    System.out.println("NO");
//                    break;
//                }
//                idx++;
//            }
//            if(i==n)
//                System.out.println("YES");
//        }
//    }
//}
