import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        int sc = 0;
        int[] alphabets = new int[26];
        while(sc < str.length()){
            if(sc <= str.length()-1)
            alphabets[(int)(str.charAt(sc))-97] +=  1;
            sc++;
        }int c=0;
        for(int i=0;i<26 ;i++){
            if(alphabets[i]>=1) c++;

        }
        if(c%2!=0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
    }
}
