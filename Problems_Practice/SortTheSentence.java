package Problems_Practice;
import java.util.Scanner;

public class SortTheSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-->0){
            String s = sc.nextLine();
            System.out.println(sort(s));

        }
    }
    public static String sort(String s){
        String[] f = new String[10];
        StringBuilder sb = new StringBuilder();
//        StringBuilder ans = new StringBuilder();
        int n = s.length();

        int i =0;
        int j = 0;
        while(i<=n){
            if(i== n || s.charAt(i)==' '){
                String word = s.substring(j, i);
                int pos = word.charAt(word.length() -1) - '0';
                word = word.substring(0, word.length()-1);
                f[pos] = word;
                j = i+1;
            }
            i++;
        }
        for(int k = 1; k <10; k++ ){
            if(f[k] != null){
                sb.append(f[k]).append(" ");
            }
        }
        return sb.toString().trim();
    }

}
