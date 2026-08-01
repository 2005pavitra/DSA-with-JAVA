package TCS_PYQ;
import java.util.*;

public class Part_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        if((w<2 || w%2 != 0) || v>w){
            System.out.println("Invalid input");
        }else{
            solve(v,w);
        }


   }

    private static void solve(int v, int w){
        int x = w/2;
        int four = x-v;
        int two = v-four;
        System.out.println("TW= "+ two+ " FW= "+ four);
//        System.out.println(four);


    }
}
