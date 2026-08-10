import java.util.*;

public class ADonTTryToCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            if(n>m){
                System.out.println("-1");
                // return;
            }

            int cnt = 0;

            boolean flag = false;
            for(int i = 0; i<=6; i++){
                if(x.contains(s)){
                    System.out.println(cnt);
                    flag = true;
                    break;
                }
                x = x.concat(x);
                cnt++;
                
            }
            if(!flag){
                System.out.println("-1");
            }
            
        }
    }
}